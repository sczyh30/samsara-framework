package org.samsara.framework.functional;

import java.util.Collection;
import java.util.function.BiFunction;

/**
 * Samsara Framework
 * Functional Library
 * Fold Manipulate Utils
 *
 * @author sczyh30
 */
public class Folds {

    private Folds() {}

    /**
     * A wrapper class for the fucking lambda closure
     */
    private static class Wrapper<T> {
        volatile T t;

        Wrapper(T t) {
            this.t = t;
        }
    }

    /**
     * Fold Left Combiner
     * @param f a function, type is (B, A) => B
     * @param z initial value
     * @param c collection
     * @param <A> initial type
     * @param <B> result type
     * @return the fold result
     */
    public static <A, B> B foldl(BiFunction<B, A, B> f, B z, Collection<A> c) {
        Wrapper<B> result = new Wrapper<>(z); // because of the fucking Java lambda's closure
        c.forEach(x -> result.t = f.apply(result.t, x));
        return result.t;
    }

    public static int sum(Collection<Integer> c) {
        return foldl((x, y) -> x + y, 0, c); // performance may not be perfect
    }

    public static int product(Collection<Integer> c) {
        return foldl((x, y) -> x * y, 1, c);
    }
}
