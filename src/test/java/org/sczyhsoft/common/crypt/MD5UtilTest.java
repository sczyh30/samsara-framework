package org.sczyhsoft.common.crypt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * MD5Util Test Class
 */
public class MD5UtilTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMD5() throws Exception {
        assertEquals("25F9E794323B453885F5181F1B624D0B",MD5Util.MD5("123456789"));
    }
}