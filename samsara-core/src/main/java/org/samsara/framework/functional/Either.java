package org.samsara.framework.functional;


import java.util.Optional;
import java.util.function.Function;

/**
 * Samsara Framework Core
 * Functional Library
 * Either Type Abstract Class
 */
public abstract class Either<A, B> {

    public volatile boolean isLeft = false;
    public volatile boolean isRight = false;

    Either() {}

    public static<A, B> Either<A, B> mkLeft(A a) {
        return new Left<>(a);
    }

    public static<A, B> Either<A, B> mkRight(B b) {
        return new Right<>(b);
    }

    public abstract A left();

    public abstract B right();

    @SuppressWarnings("unchecked")
    public <X> X fold(Function<A, X> fa, Function<B, X> fb) {
        if (isLeft)
            return fa.apply((A)((Left)this).left());
        else
            return fb.apply((B)((Right)this).right());
    }

    public abstract<S> Optional<S> toOption();

}
