package cn.cescforz.commons.encrypt.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 解密信息输入流</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:25
 */
@NoArgsConstructor
@AllArgsConstructor
public class DecryptHttpInputMessage implements HttpInputMessage {


    private InputStream body;
    private HttpHeaders headers;

    @Override
    public InputStream getBody() throws IOException {
        return body;
    }

    @Override
    public HttpHeaders getHeaders() {
        return headers;
    }
}
