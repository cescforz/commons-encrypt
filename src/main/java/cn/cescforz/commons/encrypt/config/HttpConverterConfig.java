package cn.cescforz.commons.encrypt.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>©2019 Cesc. All Rights Reserved.</p>
 * <p>Description: 响应体数据处理，防止数据类型为String时再进行JSON数据转换，那么产生最终的结果可能被双引号包含...</p>
 *
 * @author cesc
 * @version v1.0
 * @date Create in 2019-07-25 10:20
 */
@SpringBootConfiguration
public class HttpConverterConfig extends WebMvcConfigurationSupport {

    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
        return new MappingJackson2HttpMessageConverter(){
            @Override
            protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException {
                if(object instanceof String){
                    Charset charset = this.getDefaultCharset();
                    StreamUtils.copy((String)object, charset, outputMessage.getBody());
                }else{
                    super.writeInternal(object, type, outputMessage);
                }
            }
        };
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter converter = mappingJackson2HttpMessageConverter();
        List<MediaType> list = new LinkedList<>();
        list.add(MediaType.TEXT_HTML);
        list.add(MediaType.APPLICATION_JSON_UTF8);
        converter.setSupportedMediaTypes(list);
        converters.add(new StringHttpMessageConverter());
        converters.add(converter);
    }
}
