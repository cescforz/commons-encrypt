package cn.cescforz.commons.encrypt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 加密数据配置读取类</p>
 *
 *  <p>在SpringBoot项目中的application.yml中添加配置信息即可</p>
 *  <pre>
 *       api:
 *         key:
 *           aes-key: 12345678 #AES加密秘钥
 *           des-key: 12345678 #DES加密秘钥
 *  </pre>
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:20
 */
@Data
@Component
@ConfigurationProperties(prefix = "api.key")
public class EncryptBodyConfig implements Serializable {


    private static final long serialVersionUID = -7703037305151404959L;

    private String aesKey;
    private String desKey;
    private String encoding = "UTF-8";

}
