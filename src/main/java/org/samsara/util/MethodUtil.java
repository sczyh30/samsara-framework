package org.samsara.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Samsara Common Library
 * Reflection Util
 * Method Util Class
 *
 * @author sczyh30
 */
public class MethodUtil {

    /**
     * @param from      the source class
     * @param annoClass the annotation class
     * @return the method that has the annotation
     */
    public static Method getMethodByAnno(Class<?> from, Class<? extends Annotation> annoClass) {
        Method[] methods = from.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(annoClass))
                return method;
        }
        return null;
    }

    /**
     * @param from      the source class
     * @param annoClass the annotation class
     * @return the name of the method that has the annotation
     */
    public static String getNameByAnno(Class<?> from, Class<? extends Annotation> annoClass) {
        Method[] methods = from.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(annoClass))
                return method.getName();
        }
        return null;
    }
}
