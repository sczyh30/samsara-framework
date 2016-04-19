package org.samsara.framework.beans.factory;

import org.samsara.framework.beans.exception.BeansException;

/**
 * Samsara Framework
 * The default bean factory
 *
 * @author sczyh30
 */
public class DefaultBeanFactory implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<T> type) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> type) throws BeansException {
        return null;
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return null;
    }

    @Override
    public boolean exist(String name) {
        return false;
    }
}
