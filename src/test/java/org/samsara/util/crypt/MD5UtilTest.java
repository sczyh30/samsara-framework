package org.samsara.util.crypt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Class for MD5 Crypt
 * test OK
 */
public class MD5UtilTest {

    @Test
    public void testMD5() throws Exception {
        assertEquals("E10ADC3949BA59ABBE56E057F20F883E",MD5Util.MD5("123456"));
        assertEquals("F1887D3F9E6EE7A32FE5E76F4AB80D63",MD5Util.MD5("123457"));
        assertEquals("D41D8CD98F00B204E9800998ECF8427E",MD5Util.MD5(""));
        assertEquals("",MD5Util.MD5(null));
    }
}