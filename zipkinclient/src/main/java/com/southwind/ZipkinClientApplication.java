package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 23:49
 * @Description: 服务跟踪客户端启动类
 * @Version 1.0
 */
@SpringBootApplication
public class ZipkinClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class,args);
        System.out.println("服务跟踪客户端启动类...");
    }


}
