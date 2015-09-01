package org.samsara.core;

/**
 * Samsara Framework
 * 对运行时异常进行抽象，方便其它异常扩展
 */
public abstract class NestedRuntimeException extends RuntimeException {

    public NestedRuntimeException(String msg) {
        super(msg);
    }

    public NestedRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
    }


}
