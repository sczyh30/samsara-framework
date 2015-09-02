package org.samsara.aop.framework;

import org.samsara.aop.AopUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Samsara Framework
 * Aop Invocation Class
 * @author sczyh30
 */
public class AopInvocation {

    /**
     * Execute this method before the target
     *
     * @param aspect the aspect class
     * @param args   the args vars
     */
    public void doBefore(Class<?> aspect, Object[] args) {
        Method before = AopUtil.getBefore(aspect);
        if (before != null) {
            try {
                before.invoke(aspect.newInstance(), args);
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    public void doAfter(Class<?> aspect, Object[] args) {
        Method after = AopUtil.getAfter(aspect);
        if (after != null) {
            try {
                after.invoke(aspect.newInstance(), args);
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

}
