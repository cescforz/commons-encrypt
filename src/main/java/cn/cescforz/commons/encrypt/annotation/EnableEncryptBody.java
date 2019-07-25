package cn.cescforz.commons.encrypt.annotation;

import cn.cescforz.commons.encrypt.advice.EncryptResponseBodyAdvice;
import cn.cescforz.commons.encrypt.config.EncryptBodyConfig;
import cn.cescforz.commons.encrypt.config.HttpConverterConfig;
import cn.cescforz.commons.encrypt.advice.DecryptRequestBodyAdvice;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 启动类</p>
 *   <p>使用方法：在SpringBoot的Application启动类上添加此注解即可</p>
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:25
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({EncryptBodyConfig.class,
        HttpConverterConfig.class,
        EncryptResponseBodyAdvice.class,
        DecryptRequestBodyAdvice.class})
public @interface EnableEncryptBody {
}
