package cn.cescforz.commons.encrypt.exception;


import lombok.NoArgsConstructor;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 未配置KEY运行时异常</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:15
 */
@NoArgsConstructor
public class KeyNotConfiguredException extends RuntimeException {

    public KeyNotConfiguredException(String message) {
        super(message);
    }
}
