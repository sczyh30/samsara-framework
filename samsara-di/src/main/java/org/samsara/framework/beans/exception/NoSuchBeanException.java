package org.samsara.framework.beans.exception;

/**
 * Samsara DI
 * No Such Bean Exception
 */
public class NoSuchBeanException extends BeansException {

    public NoSuchBeanException(String msg) {
        super(msg);
    }

    public NoSuchBeanException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
