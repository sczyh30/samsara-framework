package org.samsara.framework.beans.factory.extension;

/**
 * Samsara Framework
 * Singleton Extension Interface
 *
 * @author sczyh30
 */
public interface SingletonExtension {

    void registerSingleton(String beanName, Object beanObj);

    Object getSingleton(String beanName);

    boolean containsSingleton(String beanName);

    int getSingletonCount();

}
