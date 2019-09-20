package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 16:01
 * @Description: 服务提供者
 * @Version 1.0
 */
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
        System.out.println("启动。。。。");
    }
}
