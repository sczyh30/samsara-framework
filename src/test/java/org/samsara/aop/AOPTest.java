package org.samsara.aop;

import org.junit.Test;

import org.samsara.aop.framework.AopScope;

/**
 * AOP Test Class
 */
public class AOPTest {

    Class<?> c = AOPAspect.class;

    @Test
    public void test() {

        AopScope scope = AopUtil.getScope(c);
        System.out.println(scope);
        if (AopUtil.getBefore(c) != null) {
            System.out.println(AopUtil.getBefore(c).getName());
        }

    }


}
