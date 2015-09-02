package org.samsara.aop.framework;

import org.samsara.aop.AopUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Samsara Framework
 * Aop Invocation Class
 */
public class AopInvocation {

    public void doBefore(Class<?> aspect, Object proxy, Object[] args) {
        Method before = AopUtil.getBefore(aspect);
        try {
            before.invoke(aspect.newInstance(), args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public void doAfter(Class<?> aspect, Object proxy, Object[] args) {
        Method after = AopUtil.getAfter(aspect);
        try {
            after.invoke(aspect.newInstance(), args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
