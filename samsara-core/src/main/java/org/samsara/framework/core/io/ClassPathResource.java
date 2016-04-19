package org.samsara.framework.core.io;

import org.samsara.framework.util.Refinement;

/**
 * Samsara Framework
 * Class Path Resource
 *
 * @author sczyh30
 */
public class ClassPathResource {

    private final String path;

    private ClassLoader classLoader;

    public ClassPathResource(String path) {
        this(path, null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        Refinement.notNull(path);
        this.path = path;
    }
}
