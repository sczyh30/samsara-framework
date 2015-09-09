package org.samsara.beans;

import org.samsara.beans.annotation.Service;

/**
 * Samsara Framework
 * Service Bean Util Class(Only for test)
 *
 * @author sczyh30
 * @since 0.0.39
 */
public final class ServiceBeanUtil {

    /**
     * Judge if the class is a service bean class
     *
     * @param c class object
     * @return if the class is a service bean class
     */
    public static boolean isService(Class<?> c) {
        return c.isAnnotationPresent(Service.class);
    }

    public static void checkService(Class<?> c) {
        if (!isService(c))
            throw new BeansException("The class " + c.getName() + " is not a service bean");
    }

}
