package org.samsara.util;

import java.util.Objects;

/**
 * Samsara Common Library
 * Optional Container
 * 此容器可以存储任意对象(包括null)
 * @author sczyh30
 * @since 0.0.13
 * Issue:暂不支持函数式编程接口
 */
public final class Optional<T> {

    private static final Optional<?> EMPTY = new Optional<>();

    private final T object;

    private Optional() {
        this.object = null;
    }

    private Optional(T obj) {
        this.object = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> get(T object) {
        return new Optional<>(object);
    }
}
