package org.samsara.aop.framework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Samsara Framework
 * JDK Dynamic Aop Proxy Class
 */
//TODO:this class should not be public!
public final class JdkDynamicAopProxy implements InvocationHandler, AopProxy {

    private Class<?> aspectClass;
    private Object target;

    public JdkDynamicAopProxy(Object target) {
        super();
        this.target = target;
    }

    public Class<?> getAspectClass() {
        return aspectClass;
    }

    public void setAspectClass(Class<?> aspectClass) {
        this.aspectClass = aspectClass;
    }

    //TODO:待完成另一个版本，结合ClassLoader
    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        AopInvocation aopInvocation = new AopInvocation();
        aopInvocation.doBefore(aspectClass, args);
        Object result = method.invoke(target, args);
        aopInvocation.doAfter(aspectClass, args);
        return result;
    }
}
