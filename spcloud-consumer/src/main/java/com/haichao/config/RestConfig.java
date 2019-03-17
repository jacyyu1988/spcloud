package com.haichao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * <p>
 *    restTemplate config
 * </p>
 * @Author yusj
 * @Date 2019/3/15
 * @Version 1.0
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate restTemplate() {
        return  new RestTemplate();
    }

    /**
     * 要进行一个Http头信息配置
     * @return
     */
    @Bean
    public HttpHeaders getHeaders() {
        // 定义一个HTTP的头信息
        HttpHeaders headers = new HttpHeaders();
        // 认证的原始信息
        String auth = "admin:enjoy";
        // 进行一个加密的处理
        byte[] encodedAuth = Base64.getEncoder()
                .encode(auth.getBytes(Charset.forName("US-ASCII")));

        String authHeader = "Basic " + new String(encodedAuth);
        headers.set("Authorization", authHeader);
        return headers;
    }
}
