package org.samsara.framework.di.resolver;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.samsara.framework.core.io.Resource;
import org.samsara.framework.di.XmlComponentProvider;

import java.io.IOException;
import java.util.Optional;

/**
 * Samsara Framework
 * Xml Configuration Resolver
 *
 * @author sczyh30
 */
public class XmlConfigResolver implements ConfigResolver {

    private final SAXReader reader = new SAXReader();

    public XmlConfigResolver() {

    }

    public XmlConfigResolver(ResolverSetting settings) {

    }

    private void initResolver(ResolverSetting settings) {

    }

    @Override
    public boolean resolve(Resource resource) {
        try {
            Document document = reader.read(resource.getFile());
            Element rootElement = document.getRootElement();
            if (!rootElement.getText().equals("context")) {
                throw new ConfigResolveException("Invalid xml config: root element must be `context`");
            }
            else {
                resolveSamsaraComponents(rootElement);
            }
        } catch (DocumentException | IOException e) {
            destroy();
            e.printStackTrace();
        }
        return false;
    }

    private void resolveSamsaraComponents(Element rootElement) {

    }

    private void destroy() {

    }


}
