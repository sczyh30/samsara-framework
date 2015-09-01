package org.samsara.util.crypt;

/**
 * Samsara Common Library
 * MD5加密
 * @author sczyh30
 * @version 0.0.28
 * @since 2015-7-7
 * 本次改进：防止空值
 * 下一版本：采用类似Optional的容器
 */

import org.samsara.util.StringUtil;

import java.security.MessageDigest;

public class MD5Util {
    public static String MD5(String s) {
        if(s != null) {
            try {
                byte[] btInput = s.getBytes();
                // 获得MD5摘要算法的 MessageDigest 对象
                MessageDigest mdInst = MessageDigest.getInstance("MD5");
                mdInst.update(btInput); // 使用指定的字节更新摘要
                byte[] md = mdInst.digest(); // 获得密文

                return StringUtil.bytes2hex(md);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        else {
            System.out.println("#E2:Null String at MD5Util.MD5");
            return "";
        }
    }
}
