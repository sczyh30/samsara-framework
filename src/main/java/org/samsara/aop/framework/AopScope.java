package org.samsara.aop.framework;

/**
 * Aop Scope Class
 */
public class AopScope {

    private String scope;

    public AopScope() {
    }

    public AopScope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }

    public boolean isAll() {
        return this.scope.equals("all");
    }

    @Override
    public String toString() {
        return "AOP_Scope: " + scope;
    }
}
