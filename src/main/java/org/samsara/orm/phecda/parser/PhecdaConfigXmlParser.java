package org.samsara.orm.phecda.parser;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Samsara Phecda ORM
 * Config Xml Parser
 *
 * @author sczyh30
 */
public class PhecdaConfigXmlParser {

    /**
     * This method parses
     *
     * @return
     */
    public List<Element> parseConfig() {
        SAXReader reader = new SAXReader();
        File file = new File("phecda.cfg.xml");
        Document document = null;
        try {
            document = reader.read(file);
            Element root = document.getRootElement();
            List<Element> childElements = root.elements();
            return childElements;
        } catch (DocumentException e) {
            e.printStackTrace();
            return null;
        }
    }


}
