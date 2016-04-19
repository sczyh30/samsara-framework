package org.samsara.framework.di;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Samsara DI
 * Abstract Component Provider
 *
 * @author sczyh30
 */
public abstract class AbstractComponentProvider implements ComponentProvider {

    private long startupDate;

    private final AtomicBoolean started = new AtomicBoolean();

    private final AtomicBoolean closed = new AtomicBoolean();

}
