package org.samsara.framework.functional;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Samsara Framework Core
 * Functional Library
 * Either Type(Left)
 */
public final class Left<A, B> extends Either<A, B> {

    private final A a;

    public Left(A a) {
        this.a = a;
        this.isLeft = true;
    }

    @Override
    public A left() {
        return this.a;
    }

    @Override
    public B right() {
        throw new NoSuchElementException("Either.left.value on Right");
    }

    @Override
    public Optional<A> toOption() {
        return Optional.ofNullable(a);
    }

    @Override
    public String toString() {
        return "Either.left: " + a.toString();
    }
}
