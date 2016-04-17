package org.samsara.framework.util.crypt;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/**
 * Samsara Common Library
 * RSA crypt class
 * @author sczyh30
 * @since 0.0.28
 */
public class RSAUtil {

    public static final int RSA_LENGTH = 512;

    public static KeyPair getKeyPair() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(RSA_LENGTH);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
