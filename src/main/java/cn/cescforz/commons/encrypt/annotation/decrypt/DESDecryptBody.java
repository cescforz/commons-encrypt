package cn.cescforz.commons.encrypt.annotation.decrypt;

import java.lang.annotation.*;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:30
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DESDecryptBody {

    String otherKey() default "";

}
