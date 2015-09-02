package org.samsara.util.crypt;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

/**
 * Samsara Common Library
 * AES加密
 *
 * @author sczyh30
 */
public class AESUtil {

    private static final int KEY_LENGTH = 128;

    public static String genKeyAES() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(KEY_LENGTH);
            SecretKey secretKey = keyGenerator.generateKey();
            return Base64Util.byte2base64(secretKey.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
