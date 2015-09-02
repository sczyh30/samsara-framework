package org.samsara.aop;

import org.samsara.aop.framework.AopException;
import org.samsara.aop.framework.NoSuchPointcutException;
import org.samsara.aop.framework.annotation.*;

import java.lang.reflect.Method;

/**
 * Samsara Framework
 * Aop Util Class
 *
 * @author sczyh30
 */
public class AopUtil {

    /**
     * Judge if the class is an aspect class
     *
     * @param c class object
     * @return if the class is an aspect class
     */
    public static boolean isAspect(Class<?> c) {
        return c.isAnnotationPresent(Aspect.class);
    }

    /**
     * Method of getting the pointcut name
     * uses reflection
     *
     * @param c class object
     * @return the pointcut name in the class
     */
    public static String getPointcutName(Class<?> c) {
        if (!isAspect(c)) {
            throw new AopException(c.getName() + " is not an aspect class");
        } else {
            Method[] methods = c.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Pointcut.class))
                    return method.getName();
            }
        }
        throw new NoSuchPointcutException("Aspect class: " + c.getName() + " do not have a pointcut");
    }

    /**
     * Method of getting the pointcut scope
     *
     * @param c class object
     * @return return the pointcut scope
     * @since 0.0.26
     */
    public static String getScope(Class<?> c) {
        try {
            return c.getMethod(getPointcutName(c)).getAnnotation(Pointcut.class).value();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
