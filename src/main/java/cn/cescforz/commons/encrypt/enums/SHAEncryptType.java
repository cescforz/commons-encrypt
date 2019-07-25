package cn.cescforz.commons.encrypt.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: SHA加密类型枚举类</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:17
 */
@Getter
@AllArgsConstructor
public enum SHAEncryptType {

    /**
     * SHA加密类型
     */
    SHA224("sha-224"),
    SHA256("sha-256"),
    SHA384("sha-384"),
    SHA512("sha-512");

    private String value;
}
