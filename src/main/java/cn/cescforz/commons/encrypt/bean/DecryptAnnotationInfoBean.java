package cn.cescforz.commons.encrypt.bean;

import cn.cescforz.commons.encrypt.enums.DecryptBodyMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 解密注解信息</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DecryptAnnotationInfoBean implements Serializable {


    private static final long serialVersionUID = -553735718802697571L;

    private DecryptBodyMethod decryptBodyMethod;
    private String key;

}
