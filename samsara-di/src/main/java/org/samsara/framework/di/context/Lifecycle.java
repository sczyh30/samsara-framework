package org.samsara.framework.di.context;

/**
 * Samsara Framework
 * Lifecycle
 */
public interface Lifecycle {

    void start();

    void stop();

    boolean isRunning();
}
