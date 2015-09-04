package org.samsara.orm.phecda.parser;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Phecda Config Xml Parser Test
 */
public class PhecdaConfigXmlParserTest {

    @Test
    public void testParseConfig() throws Exception {
        PhecdaConfigXmlParser parser = new PhecdaConfigXmlParser();
        parser.parseConfig().forEach(System.out::println);
    }
}