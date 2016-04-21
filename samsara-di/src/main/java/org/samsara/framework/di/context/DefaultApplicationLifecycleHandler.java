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
public class DefaultApplicationLifecycleHandler implements LifecycleHandler {

    private volatile List<Supplier<CompletableFuture<?>>> startHooks = new ArrayList<>();

    private volatile List<Supplier<CompletableFuture<?>>> stopHooks = new ArrayList<>();

    @Override
    public synchronized void addStopHook(Supplier<CompletableFuture<?>> hook) {
        stopHooks.add(hook);
    }

    @Override
    public synchronized void addStartHook(Supplier<CompletableFuture<?>> hook) {
        startHooks.add(hook);
    }

    @Override
    public void start() {
        foldInvoke(startHooks);
    }

    @Override
    public void stop() {
        foldInvoke(stopHooks);
    }

    /**
     * Invoke fold operation on the hook list
     * @param hooks hook list, maybe onStart or onStop
     */
    private void foldInvoke(List<Supplier<CompletableFuture<?>>> hooks) {
        Folds.<Supplier<CompletableFuture<?>>, CompletableFuture<?>>foldl((future, hook) ->
                        future.thenCompose(t ->
                                hook.get()),
                CompletableFuture.completedFuture(new Object()), hooks);
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
