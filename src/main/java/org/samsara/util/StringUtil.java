package org.samsara.util;

import java.util.Objects;

/**
 * Samsara Common Library
 * String Util Class
 * 字符串操作基本扩展功能
 *
 * @author sczyh30
 * @version 0.0.28
 * @since 2015-7-7
 * issue:on board
 * 下一版本：待定
 */
public class StringUtil {

    /**
     * 判断是否为空字符
     */
    public static boolean isEmpty(String s) {
        return Objects.equals(s, "");
    }

    public static boolean isNull(Object o) {
        return o == null;
    }

    @Deprecated
    public static String erase(String str, int from, int to) {
        return str;
    }

    public static String bytes2hex(byte[] bytes) {
        if(!isNull(bytes)) {
            StringBuilder hexString = new StringBuilder();
            //字节数组转换为十六进制数
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
            System.out.println("#E2:Null Object when converting at StringUtil.bytes2hex");
            return "";
        }
    }


    /*public static String bytes2hex(byte[] bytes) {
        if(!isNull(bytes)) {
            char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            int j = bytes.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (byte byte0 : bytes) {
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        }
        else {
            System.out.println("#E6:Null Object when converting at StringUtil.bytes2hex");
            return "";
        }
    }*/
}
