package org.samsara.framework.di.resolver;

import org.samsara.framework.core.io.Resource;

/**
 * Samsara Framework
 * Configuration Resolver Interface
 *
 * @author sczyh30
 */
public interface ConfigResolver {

    /**
     * Resolve a resource object
     * @param resource resource object
     */
    boolean resolve(Resource resource);

}
