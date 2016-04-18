package org.samsara.framework.util.crypt;

import org.samsara.framework.core.CommonRuntimeException;

/**
 * Samsara Framework
 * Encrypt Exception
 */
class EncryptException extends CommonRuntimeException {

    public EncryptException(String msg) {
        super(msg);
    }

    public EncryptException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
