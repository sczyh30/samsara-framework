package org.samsara.framework.aop.exception;

import org.samsara.framework.core.CommonRuntimeException;

/**
 * Samsara Framework
 * AOP Common Exception
 *
 * @author sczyh30
 * @since  0.1.0
 */
public class AopException extends CommonRuntimeException {

    public AopException(String msg) {
        super(msg);
    }

    public AopException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
