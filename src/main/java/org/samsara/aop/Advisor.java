package org.samsara.aop;

import org.aopalliance.aop.Advice;

/**
 * Samsara Framework
 * Base interface holding AOP advice
 */
public class Advisor {

    /**
     * @return the advice part of this aspect
     */
    Advice getAdvice();
}
