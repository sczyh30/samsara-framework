package org.samsara.aop;

import org.junit.Test;
import org.samsara.aop.framework.AopException;
import org.samsara.aop.framework.annotation.Pointcut;

/**
 * AOP Test Class
 */
public class AOPTest {

    Class<?> c = AOPAspect.class;

    @Test
    public void test() {

        String scope = AopUtil.getScope(c);
        System.out.println(scope);
    }
}
