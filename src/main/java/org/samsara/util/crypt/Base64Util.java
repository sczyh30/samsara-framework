package org.samsara.util.crypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Samsara Common Library
 * Base64编码
 *
 * @author sczyh30
 */
public class Base64Util {

    public static String byte2base64(byte[] bytes) {
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(bytes);
    }

    public static byte[] base642byte(String base64) {
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            return base64Decoder.decodeBuffer(base64);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
