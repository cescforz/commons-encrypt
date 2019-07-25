package cn.cescforz.commons.encrypt.util;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: DES加密处理工具类</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:10
 */
@Slf4j
public final class DESEncryptUtil {

    private DESEncryptUtil() {
        throw new AssertionError();
    }

    /**
     * DES加密
     *
     * @param content  字符串内容
     * @param password 密钥
     */
    public static String encrypt(String content, String password) {
        return des(content, password, Cipher.ENCRYPT_MODE);
    }


    /**
     * DES解密
     *
     * @param content  字符串内容
     * @param password 密钥
     */
    public static String decrypt(String content, String password) {
        return des(content, password, Cipher.DECRYPT_MODE);
    }


    /**
     * DES加密/解密公共方法
     *
     * @param content  字符串内容
     * @param password 密钥
     * @param type     加密：{@link Cipher#ENCRYPT_MODE}，解密：{@link Cipher#DECRYPT_MODE}
     */
    private static String des(String content, String password, int type) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(type, keyFactory.generateSecret(desKey), random);

            if (type == Cipher.ENCRYPT_MODE) {
                byte[] byteContent = content.getBytes(StandardCharsets.UTF_8);
                return Hex2Util.parseByte2HexStr(cipher.doFinal(byteContent));
            } else {
                byte[] byteContent = Hex2Util.parseHexStr2Byte(content);
                assert byteContent != null;
                return new String(cipher.doFinal(byteContent));
            }
        } catch (Exception e) {
            log.error("des error:", e);
        }
        return null;
    }


}
