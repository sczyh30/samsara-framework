package org.samsara.framework.util;

import java.util.Objects;

/**
 * Samsara Common Library
 * String Util Class
 *
 * @author sczyh30
 */
public class StringUtil {

    /**
     * isEmpty
     */
    public static boolean isEmpty(String s) {
        return Objects.equals(s, "");
    }

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
            throw new RuntimeException("NULL String when converting at StringUtil.bytes2hex");
        }
    }

}
