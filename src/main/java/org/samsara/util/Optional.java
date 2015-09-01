package org.samsara.util;

import java.util.Objects;

/**
 * ScZyhSoft Common Library
 * Optional Container
 * 此容器可以存储任意对象(包括null)
 * @author sczyh30
 * @version 0.1 2015-7-7
 * @since 0.1
 * Issue:暂不支持函数式编程接口
 * 下一版本：争取支持函数式接口
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
