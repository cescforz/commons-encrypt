package cn.cescforz.commons.encrypt.annotation.encrypt;


import cn.cescforz.commons.encrypt.enums.EncryptBodyMethod;
import cn.cescforz.commons.encrypt.enums.SHAEncryptType;

import java.lang.annotation.*;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>加密{@link org.springframework.web.bind.annotation.ResponseBody}响应数据，可用于整个控制类或者某个控制器上</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:30
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EncryptBody {

    EncryptBodyMethod value() default EncryptBodyMethod.MD5;

    String otherKey() default "";

    SHAEncryptType shaType() default SHAEncryptType.SHA256;

}
