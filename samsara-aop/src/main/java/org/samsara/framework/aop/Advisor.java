package org.samsara.framework.aop;

import org.aopalliance.aop.Advice;

/**
 * Samsara Framework
 * Base interface holding AOP advice
 */
public interface Advisor {

    /**
     * @return the advice part of this aspect
     */
    Advice getAdvice();
}
