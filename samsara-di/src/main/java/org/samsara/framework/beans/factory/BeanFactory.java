package org.samsara.framework.beans.factory;

import org.samsara.framework.beans.exception.BeansException;

/**
 * Samsara Framework
 * The root bean container interface
 *
 * @author sczyh30
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    <T> T getBean(String name, Class<T> type) throws BeansException;

    <T> T getBean(Class<T> type) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
