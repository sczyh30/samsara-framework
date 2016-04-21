package org.samsara.framework.beans.factory.extension;

import org.samsara.framework.util.Refinement;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Samsara Framework
 * Default Singleton Extension
 *
 * @author sczyh30
 */
public class DefaultSingletonExtension implements SingletonExtension {

    protected static final Object NULL_OBJECT = new Object();

    private final Map<String, Object> sgObjects = new ConcurrentHashMap<>(128);

    private final Set<String> registeredSingletons = new LinkedHashSet<>(128);

    @Override
    public void registerSingleton(String beanName, Object beanObj) {
        Refinement.notNull(beanName, "Bean name could not be null");
        synchronized (this.sgObjects) {
            Object before = this.sgObjects.get(beanName);
            if (before != null) {
                throw new IllegalStateException("Internal singleton error: the bean [" + beanName
                    + "] already exists in the singleton cache");
            }
            addSingleton(beanName, beanObj);
        }
    }

    @Override
    public Object getSingleton(String beanName) {
        Refinement.notNull(beanName, "Bean name could not be null");
        synchronized (this.sgObjects) {

        }
        return null;
    }

    @Override
    public boolean containsSingleton(String beanName) {
        return sgObjects.containsKey(beanName);
    }

    protected void addSingleton(String beanName, Object beanObj) { // need to lock?
        synchronized (this.sgObjects) {
            this.sgObjects.put(beanName, beanObj == null ? NULL_OBJECT : beanObj);
            this.registeredSingletons.add(beanName);
        }
    }

    protected void removeSingleton(String beanName) {
        Refinement.notNull(beanName, "Bean name could not be null");
        synchronized (this.sgObjects) {
            this.sgObjects.remove(beanName);
            this.registeredSingletons.remove(beanName);
        }
    }

    @Override
    public int getSingletonCount() {
        synchronized (this.sgObjects) {
            return this.sgObjects.size();
        }
    }
}
