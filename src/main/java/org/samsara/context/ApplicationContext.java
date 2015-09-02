package org.samsara.context;

import org.samsara.beans.BeansException;
import org.samsara.beans.factory.BeanFactory;

/**
 * Samsara Framework
 * IoC ApplicationContext
 */
public class ApplicationContext implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return null;
    }

    @Override
    public boolean containsBean(String name) {
        return false;
    }
}
