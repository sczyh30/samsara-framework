package org.samsara.aop;

import org.junit.Test;

import org.samsara.aop.framework.AopScope;

import java.util.ArrayList;
import java.util.List;

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

    public void processData() {
        List<Integer> list = new ArrayList<>();
        list.add(156);
        list.add(7);
        list.add(63);
        list.add(12);
        list.add(-8);
        list.add(4);
        list.stream().map(Math::abs)
                .filter(x -> x > 60)
                .sorted((x1, x2) -> x1 > x2 ? x1 : x2)
                .forEach(System.out::println);
    }
}
