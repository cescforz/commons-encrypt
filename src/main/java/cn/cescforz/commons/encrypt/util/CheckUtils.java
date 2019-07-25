package cn.cescforz.commons.encrypt.util;

import cn.cescforz.commons.encrypt.exception.KeyNotConfiguredException;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 辅助检测工具类</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:00
 */
public final class CheckUtils {

    private CheckUtils() {
        throw new AssertionError();
    }

    public static String checkAndGetKey(String k1, String k2, String keyName) {
        if (StringUtils.isBlank(k1) && StringUtils.isBlank(k2)) {
            throw new KeyNotConfiguredException(String.format("%s is not configured (未配置%s)", keyName, keyName));
        }
        if (k1 == null) {
            return k2;
        }
        return k1;
    }
}
