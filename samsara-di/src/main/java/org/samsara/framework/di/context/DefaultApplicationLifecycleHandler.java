package org.samsara.framework.di.context;

import org.samsara.framework.functional.Folds;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * Samsara Framework
 * Default Application Lifecycle Handler
 *
 * @author sczyh30
 */
public class DefaultApplicationLifecycleHandler implements ApplicationLifecycleHandler {

    private volatile List<Supplier<CompletableFuture<?>>> stopHooks = new ArrayList<>();

    @Override
    public synchronized void addStopHook(Supplier<CompletableFuture<?>> hook) {
        stopHooks.add(hook);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {
        Folds.<Supplier<CompletableFuture<?>>, CompletableFuture<?>>foldl((future, hook) ->
                future.thenCompose(t ->
                        hook.get()),
                CompletableFuture.completedFuture(new Object()), stopHooks);
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
