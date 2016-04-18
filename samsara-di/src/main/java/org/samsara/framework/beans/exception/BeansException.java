package org.samsara.framework.beans.exception;

import org.samsara.framework.core.CommonRuntimeException;

/**
 * Samsara DI
 * Beans Exception
 */
public abstract class BeansException extends CommonRuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
