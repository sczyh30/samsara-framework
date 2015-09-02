package org.samsara.beans.factory;

import org.samsara.beans.BeansException;

/**
 * Samsara Framework
 * Basic Bean Factory
 */
public interface BeanFactory {

    /**
     * Get the bean instance by name
     *
     * @param name the name of the bean to retrieve
     * @return an instance of bean
     * @throws BeansException if something wrong happens
     */
    Object getBean(String name) throws BeansException;

    /**
     * Get the bean instance by name and class type with generic
     *
     * @param name         the name of the bean to retrieve
     * @param requiredType the type class of the bean to retrieve
     * @param <T>          any type
     * @return an instance of bean matches the class
     * @throws BeansException if something wrong happens
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    /**
     * @param name bean name
     * @return if the container contains the bean
     */
    boolean containsBean(String name);
}
