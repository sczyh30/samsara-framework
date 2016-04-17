package org.samsara.framework.core;

/**
 * Samsara Framework
 * Abstract Common Runtime Exception
 *
 * @author sczyh30
 * @since  0.1.0
 */
public abstract class CommonRuntimeException extends RuntimeException {

    public CommonRuntimeException(String msg) {
        super(msg);
    }

    public CommonRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
