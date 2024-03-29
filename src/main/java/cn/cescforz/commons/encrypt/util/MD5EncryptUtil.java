package cn.cescforz.commons.encrypt.util;

import cn.cescforz.commons.encrypt.exception.EncryptBodyFailException;
import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: MD5加密工具类</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:05
 */
@Slf4j
public final class MD5EncryptUtil {

    private MD5EncryptUtil() {
        throw new AssertionError();
    }

    /**
     * MD5加密-32位小写
     * @param encryptStr :
     * @return java.lang.String
     */
    public static String encrypt(String encryptStr) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md5.digest(encryptStr.getBytes());
            StringBuilder hexValue = new StringBuilder();
            for (byte md5Byte : md5Bytes) {
                int val = ((int) md5Byte) & 0xff;
                if (val < 16) {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }
            encryptStr = hexValue.toString();
        } catch (Exception e) {
            log.error("error:", e);
            throw new EncryptBodyFailException(e.getMessage());
        }
        return encryptStr;
    }

}
