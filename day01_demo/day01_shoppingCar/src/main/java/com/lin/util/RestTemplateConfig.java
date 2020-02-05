package com.lin.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *@author: liulei
 *@date: 2019/12/8 0008 下午 9:12
 *@describe: 在springboot中发送http请求可以使用RestTemplate
 * 此类作用为将此类注入到spring容器中
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
