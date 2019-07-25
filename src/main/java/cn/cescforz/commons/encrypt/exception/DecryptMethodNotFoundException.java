package cn.cescforz.commons.encrypt.exception;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 加密方式未找到或未定义异常</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:17
 */
public class DecryptMethodNotFoundException extends RuntimeException {

    public DecryptMethodNotFoundException() {
        super("Decryption method is not defined. (解密方式未定义)");
    }

    public DecryptMethodNotFoundException(String message) {
        super(message);
    }
}
