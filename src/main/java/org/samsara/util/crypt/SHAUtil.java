package org.samsara.util.crypt;

import org.samsara.util.StringUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Samsara Common Library
 * SHA加密
 * @author sczyh30
 * @version 0.0.28
 * @since 2015.7
 */
public class SHAUtil {
    public static String SHA1(String decript) {
        if(decript != null) {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-1");
                digest.update(decript.getBytes());
                byte messageDigest[] = digest.digest();

                return StringUtil.bytes2hex(messageDigest);
            }
            catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        }
        else {
            System.out.println("#E2:Null String at SHA1Util.SHA1");
            return "";
        }
    }
}
