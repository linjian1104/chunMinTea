package com.shiyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: liulei
 * @date: 2019/12/10 9:45
 * @describe:
 */
@SpringBootApplication
@EnableEurekaClient
public class CM_javaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CM_javaApplication .class,args);
    }
}
