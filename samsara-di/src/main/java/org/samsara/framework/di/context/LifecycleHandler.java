package org.samsara.framework.di.context;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * Samsara Framework
 * Lifecycle Handler Interface
 *
 * @author sczyh30
 */
public interface LifecycleHandler extends Lifecycle {

    /**
     * Add a async hook handler on application start
     * The hook should be in this type: `Supplier<CompletableFuture<?>>`
     * @param hook hook
     */
    void addStartHook(Supplier<CompletableFuture<?>> hook);

    /**
     * Add a async hook handler on application stop
     * The hook should be in this type: `Supplier<CompletableFuture<?>>`
     * @param hook hook
     */
    void addStopHook(Supplier<CompletableFuture<?>> hook);

}
