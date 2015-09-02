package org.samsara.aop.framework;

import org.samsara.core.NestedRuntimeException;

/**
 * Aop Exception
 * includes NoSuchAspectException
 */
public class AopException extends NestedRuntimeException {

    /**
     * AOP Exception
     *
     * @param msg error message
     */
    public AopException(String msg) {
        super(msg);
    }

    public AopException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
