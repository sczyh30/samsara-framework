package org.samsara.aop;

import org.samsara.aop.framework.AopException;
import org.samsara.aop.framework.AopScope;
import org.samsara.aop.framework.NoSuchPointcutException;
import org.samsara.aop.framework.annotation.*;
import org.samsara.util.MethodUtil;

import java.lang.reflect.Method;

/**
 * Samsara Framework
 * AOP Util Class
 * provides the primary functions for the Samsara AOP
 * @author sczyh30
 * My thought：写个AOP太JB蛋疼了。。
 */
public class AopUtil {

    /**
     * Judge if the class is an aspect class
     * @param c class object
     * @return if the class is an aspect class
     */
    public static boolean isAspect(Class<?> c) {
        return c.isAnnotationPresent(Aspect.class);
    }

    public static void checkAspect(Class<?> c) {
        if (!isAspect(c)) {
            throw new AopException(c.getName() + " is not an aspect class");
        }
    }

    /**
     * @param method the method
     * @return if the method is a pointcut
     */
    public static boolean isPointcut(Method method) {
        return method.isAnnotationPresent(Pointcut.class);
    }

    /**
     * @param method the method
     * @return if the method is a before advice
     */
    public static boolean isBefore(Method method) {
        return method.isAnnotationPresent(BeforeAdvice.class);
    }

    /**
     * @param method the method
     * @return if the method is a after advice
     */
    public static boolean isAfter(Method method) {
        return method.isAnnotationPresent(AfterAdvice.class);
    }

    /**
     * Method of getting the pointcut name
     * uses reflection
     * @param c class object
     * @return the pointcut name in the class
     */
    public static String getPointcutName(Class<?> c) {
        checkAspect(c);
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Pointcut.class))
                return method.getName();
        }
        throw new NoSuchPointcutException("Aspect class: " + c.getName() + " do not have a pointcut");
    }

    /**
     * Method of getting the before advice method from the class
     * @param c class object
     * @return the before advice method object
     */
    public static Method getBefore(Class<?> c) {
        checkAspect(c);
        Method method = MethodUtil.getMethodByAnno(c, BeforeAdvice.class);
        if (method != null)
            return method;
        else
            throw new AopException("Aspect class: " + c.getName() + " do not have a BeforeAdvice");
    }

    /**
     * Method of getting the before advice method from the class
     *
     * @param c class object
     * @return the before advice method object
     */
    public static Method getAfter(Class<?> c) {
        checkAspect(c);
        Method method = MethodUtil.getMethodByAnno(c, AfterAdvice.class);
        if (method != null)
            return method;
        else
            throw new AopException("Aspect class: " + c.getName() + " do not have a BeforeAdvice");
    }

    /**
     * Method of getting the pointcut scope
     * @see #getPointcutName(Class)
     * @param c class object
     * @return return the pointcut scope
     * @since 0.0.26
     */
    public static AopScope getScope(Class<?> c) {
        try {
            return new AopScope(c.getMethod(getPointcutName(c))
                    .getAnnotation(Pointcut.class).value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
