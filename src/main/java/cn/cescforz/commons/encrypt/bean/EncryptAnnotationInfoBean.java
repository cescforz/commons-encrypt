package cn.cescforz.commons.encrypt.bean;

import cn.cescforz.commons.encrypt.enums.EncryptBodyMethod;
import cn.cescforz.commons.encrypt.enums.SHAEncryptType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 加密注解信息</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EncryptAnnotationInfoBean implements Serializable {


    private static final long serialVersionUID = -3746040960914169364L;

    private String key;
    private EncryptBodyMethod encryptBodyMethod;
    private SHAEncryptType shaEncryptType;

}
