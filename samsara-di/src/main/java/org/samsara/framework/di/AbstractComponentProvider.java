package org.samsara.framework.di;

import org.samsara.framework.di.context.LifecycleHandler;
import org.samsara.framework.di.resolver.ConfigResolver;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Samsara DI
 * Abstract Component Provider
 *
 * @author sczyh30
 */
public abstract class AbstractComponentProvider implements ConfigurableComponentProvider {

    private ComponentProvider parent;

    private LifecycleHandler lifecycleHandler;

    private ConfigResolver configResolver;

    private long startupDate;

    private final AtomicBoolean started = new AtomicBoolean();

    private final AtomicBoolean closed = new AtomicBoolean();

}
