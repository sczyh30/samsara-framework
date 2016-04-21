package org.samsara.framework.functional;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Samsara Framework Core
 * Functional Library
 * Either Type(Right)
 */
public final class Right<A, B> extends Either<A, B> {

    private final B b;

    public Right(B b) {
        this.b = b;
        this.isRight = true;
    }

    @Override
    public A left() {
        throw new NoSuchElementException("Either.right.value on Left");
    }

    @Override
    public B right() {
        return this.b;
    }

    @Override
    public Optional<B> toOption() {
        return Optional.ofNullable(b);
    }

    @Override
    public String toString() {
        return "Either.right: " + b.toString();
    }
}
