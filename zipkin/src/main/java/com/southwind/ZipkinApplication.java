package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 23:41
 * @Description: 服务跟踪服务端
 * @Version 1.0
 */
@SpringBootApplication
@EnableZipkinServer             //声明启动 Zipkin Server
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class,args);
        System.out.println("服务跟踪服务端启动");
    }
}
