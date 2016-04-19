package org.samsara.framework.functional;


import java.util.Optional;
import java.util.function.Function;

/**
 * Samsara Framework Core
 * Functional Library
 * Either Type Constructor Abstract Class
 *
 * @author sczyh30
 */
public abstract class Either<A, B> {

    public volatile boolean isLeft = false;
    public volatile boolean isRight = false;

    /**
     * No sense. Just leave it empty.
     */
    protected Either() {}

    /**
     * Generate a Left either monad
     * @param a left obj
     * @param <A> left type
     * @param <B> right type
     * @return Left either monad
     */
    public static<A, B> Either<A, B> mkLeft(A a) {
        return new Left<>(a);
    }

    /**
     * Generate a Right either monad
     * @param b right obj
     * @param <A> left type
     * @param <B> right type
     * @return Right either monad
     */
    public static<A, B> Either<A, B> mkRight(B b) {
        return new Right<>(b);
    }

    /**
     * Get the data if the either monad is Left
     * @return data a with type A if Left; else throw an exception
     */
    public abstract A left();

    /**
     * Get the data if the either monad is Right
     * @return data b with type B if Left; else throw an exception
     */
    public abstract B right();

    /**
     * Fold the either monad using a function: X => Y
     * @param fa a function aimed at Left dataL A => Y
     * @param fb a function aimed at Right dataL B => Y
     * @param <X> the result type; A if this data is Left type, B if Right
     * @return the result
     */
    @SuppressWarnings("unchecked")
    public <X> X fold(Function<A, X> fa, Function<B, X> fb) {
        if (isLeft)
            return fa.apply((A)((Left)this).left());
        else
            return fb.apply((B)((Right)this).right());
    }

    /**
     * Convert the either monad to option monad
     * @param <S> the data type
     * @return the Optional data
     */
    public abstract<S> Optional<S> toOption();

}
