package cn.cescforz.commons.encrypt.annotation.decrypt;

import cn.cescforz.commons.encrypt.enums.DecryptBodyMethod;

import java.lang.annotation.*;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>解密含有{@link org.springframework.web.bind.annotation.RequestBody}注解的参数请求数据，可用于整个控制类或者某个控制器上</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:30
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DecryptBody {

    DecryptBodyMethod value() default DecryptBodyMethod.AES;

    String otherKey() default "";

}
