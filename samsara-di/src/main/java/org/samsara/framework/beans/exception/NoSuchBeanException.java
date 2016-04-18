package org.samsara.framework.beans.exception;

/**
 * Samsara DI
 * No Such Bean Exception
 */
public class NoSuchBeanException extends BeansException {

    private String beanName;

    private Class<?> beanType;

    public NoSuchBeanException(String name) {
        super("No bean named " + name + " is defined");
        this.beanName = name;
    }

    public NoSuchBeanException(String name, String message) {
        super("No bean named " + name + " is defined:" + message);
        this.beanName = name;
    }

    public NoSuchBeanException(Class<?> type) {
        super("No appropriate bean of type [" + type.getName() + "] is defined");
        this.beanType = type;
    }

    public NoSuchBeanException(Class<?> type, String message) {
        super("No appropriate bean of type [" + type.getName() + "] is defined:" + message);
        this.beanType = type;
    }

}
