package org.samsara.framework.util;

import java.util.Objects;

/**
 * Samsara Common Library
 * String Utils Class
 *
 * @author sczyh30
 */
public class StringUtils {

    /**
     * isEmpty
     */
    public static boolean isEmpty(String s) {
        return Objects.equals(s, "");
    }

    /**
     * Convert the byte array to string
     */
    public static String bytes2hex(byte[] bytes) {
        if(Objects.nonNull(bytes)) {
            StringBuilder hexString = new StringBuilder();
            for (byte b : bytes) {
                String shaHex = Integer.toHexString(b & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString().toUpperCase();
        }
        else {
            throw new NullPointerException("NULL String when converting at StringUtils.bytes2hex");
        }
    }

}
