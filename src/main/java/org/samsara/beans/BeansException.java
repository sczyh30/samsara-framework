package org.samsara.beans;

import org.samsara.core.NestedRuntimeException;

/**
 * BeansException
 */
public class BeansException extends NestedRuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
