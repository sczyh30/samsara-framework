package org.samsara.framework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Samsara Framework
 * Input Stream Source
 *
 * @author sczyh30
 */
public interface InputStreamSource {

    InputStream getInputStream() throws IOException;

}
