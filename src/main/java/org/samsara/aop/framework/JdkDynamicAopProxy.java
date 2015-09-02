package org.samsara.aop.framework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Samsara Framework
 * JDK动态代理实现类
 */
final class JdkDynamicAopProxy implements InvocationHandler, AopProxy {

    private Object target;

    public JdkDynamicAopProxy(Object target) {
        super();
        this.target = target;
    }

    //TODO:待完成另一个版本，结合ClassLoader
    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args);
        return result;
    }
}
