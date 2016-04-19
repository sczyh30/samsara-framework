package org.samsara.framework.core.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

/**
 * Samsara Framework
 * Common Resource
 *
 * @author sczyh30
 */
public interface Resource extends InputStreamSource {

    URL getURL() throws IOException;

    URI getURI() throws IOException;

    File getFile() throws IOException;

    String getDescription();
}
