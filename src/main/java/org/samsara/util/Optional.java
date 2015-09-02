package org.samsara.util;

import java.util.Objects;

/**
 * Samsara Common Library
 * Optional Container
 * 此容器可以存储任意对象(包括null)
 * @author sczyh30
 * @since 2015.7
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
