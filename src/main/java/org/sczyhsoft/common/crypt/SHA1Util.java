package org.sczyhsoft.common.crypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ScZyhSoft Common Library
 * SHA1加密
 * @author sczyh30
 * @version 0.11-build 2 2015-7-7
 * @since 0.1
 * 本次改进：防止空值
 * 下一版本：采用类似Optional的容器
 */
public class SHA1Util {
    public static String SHA1(String decript) {
        if(decript != null) {
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
        }
        else {
            System.out.println("#E2:Null String at SHA1Util.SHA1");
            return null;
        }
        return null;
    }
}
