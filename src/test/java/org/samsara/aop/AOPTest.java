package org.samsara.aop;

import org.junit.Test;
import org.samsara.aop.framework.annotation.Pointcut;

/**
 * AOP Test Class
 */
public class AOPTest {

    Class<?> c = AOPAspect.class;

    @Test
    public void test() {
        if (AopUtil.isAspect(c)) {
            try {
                String scope = c.getMethod(AopUtil.getPointcutName(c)).getAnnotation(Pointcut.class).value();
                System.out.println(scope);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }
}
