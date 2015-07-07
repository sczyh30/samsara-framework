package org.sczyhsoft.common.crypt;

/**
 * ScZyhSoft Common Library
 * MD5加密
 * @author sczyh30
 * @version 0.11-build 2 2015-7-7
 * 本次改进：防止空值
 * 下一版本：采用类似Optional的容器
 */
import java.security.MessageDigest;

public class MD5Util {
    public static String MD5(String s) {
        if(s != null) {
            char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            try {
                byte[] btInput = s.getBytes();
                // 获得MD5摘要算法的 MessageDigest 对象
                MessageDigest mdInst = MessageDigest.getInstance("MD5");
                // 使用指定的字节更新摘要
                mdInst.update(btInput);
                // 获得密文
                byte[] md = mdInst.digest();
                // 把密文转换成十六进制的字符串形式
                int j = md.length;
                char str[] = new char[j * 2];
                int k = 0;
                for (byte byte0 : md) {
                    str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                    str[k++] = hexDigits[byte0 & 0xf];
                }
                return new String(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("#E2:Null String at MD5Util.MD5");
            return null;
        }
        return null;
    }
}
