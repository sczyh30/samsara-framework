package org.samsara.framework.di.resolver;

import org.samsara.framework.core.CommonRuntimeException;

/**
 * Samsara Framework
 * Config File Resolve Exception
 *
 * @author sczyh30
 */
public class ConfigResolveException extends CommonRuntimeException {

    public ConfigResolveException(String msg) {
        super(msg);
    }

    public ConfigResolveException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
