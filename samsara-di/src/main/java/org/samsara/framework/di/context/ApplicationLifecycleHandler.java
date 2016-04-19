package org.samsara.framework.di.context;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * Samsara Framework
 * Application Lifecycle Handler
 *
 * @author sczyh30
 */
public interface ApplicationLifecycleHandler extends Lifecycle {

    void addStopHook(Supplier<CompletableFuture<?>> hook);

}
