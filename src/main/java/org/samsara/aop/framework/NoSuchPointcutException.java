package org.samsara.aop.framework;

import org.samsara.core.NestedRuntimeException;

/**
 * Samsara Framework
 * Aop NoSuchPointcut Exception
 */
public class NoSuchPointcutException extends NestedRuntimeException {

    /**
     * This occurs when there are no pointcuts
     *
     * @param s error message
     */
    public NoSuchPointcutException(String s) {
        super(s);
    }
}
