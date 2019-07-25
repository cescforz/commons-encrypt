

package cn.cescforz.commons.encrypt.util;


import cn.cescforz.commons.encrypt.enums.SHAEncryptType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: SHA加密工具类</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:00
 */
@Slf4j
public final class SHAEncryptUtil {

    private SHAEncryptUtil() {
        throw new AssertionError();
    }

    /**
     * SHA加密公共方法
     *
     * @param source 目标字符串
     * @param type   加密类型 {@link SHAEncryptType}
     */
    public static String encrypt(String source, SHAEncryptType type) {
        if (StringUtils.isBlank(source)) {
            return "";
        }
        if (type == null) {
            type = SHAEncryptType.SHA256;
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance(type.getValue());
            byte[] bytes = md5.digest((source).getBytes());
            StringBuilder result = new StringBuilder();
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result.append(temp);
            }
            return result.toString();
        } catch (NoSuchAlgorithmException e) {
            log.error("encrypt error:", e);
        }
        return "";
    }
}
