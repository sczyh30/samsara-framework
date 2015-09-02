package org.samsara.aop.framework;

import org.junit.Test;
import org.samsara.aop.AOPAspect;
import org.samsara.test.PrintService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Aop JdkDynamicAopProxy Test
 * Test OK
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void testInvoke() throws Exception {

        PrintService printService = this::processData;
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(printService);
        jdkDynamicAopProxy.setAspectClass(AOPAspect.class);
        PrintService proxy = (PrintService) jdkDynamicAopProxy.getProxy();
        proxy.processData();
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