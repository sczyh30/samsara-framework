package org.sczyhsoft.common.crypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ScZyhSoft Common Library
 * SHA1加密
 * @author sczyh30
 * @version 0.1
 * 下一版本：避免NullPointer，模仿JDK1.8的Optional制作工具类
 */
public class SHA1Util {
    public static String SHA1(String decript) {
        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            StringBuilder hexString = new StringBuilder();
            //字节数组转换为十六进制数
            for (byte aMessageDigest : messageDigest) {
                String shaHex = Integer.toHexString(aMessageDigest & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
