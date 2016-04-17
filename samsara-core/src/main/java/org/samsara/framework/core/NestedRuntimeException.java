package org.samsara.framework.core;

/**
 * Samsara Framework
 * Abstract Nested Exception
 */
public abstract class NestedRuntimeException extends RuntimeException {

    public NestedRuntimeException(String msg) {
        super(msg);
    }

    public NestedRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
