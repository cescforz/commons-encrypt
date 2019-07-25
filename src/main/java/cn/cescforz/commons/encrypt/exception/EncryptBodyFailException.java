package cn.cescforz.commons.encrypt.exception;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 加密数据失败异常</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:17
 */
public class EncryptBodyFailException  extends RuntimeException {

    public EncryptBodyFailException() {
        super("Encrypted data failed. (加密数据失败)");
    }

    public EncryptBodyFailException(String message) {
        super(message);
    }
}