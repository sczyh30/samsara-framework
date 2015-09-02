package org.samsara.aop;

import org.samsara.aop.framework.annotation.*;

/**
 * AOP Test Aspect
 */
@Aspect
public class AOPAspect {

    /**
     * The pointcut
     */
    @Pointcut(value = "all")
    public void doPointcut() {
    }

    /**
     * The Before Advice
     */
    @BeforeAdvice(value = "doPointCut")
    public void beforeAdvice() {
        System.out.println("Aspect Test - Before Advice");
    }

    /**
     * The After Advice
     */
    @AfterAdvice(value = "doPointCut")
    public void afterAdvice() {
        System.out.println("Aspect Test - After Advice");
    }

}
