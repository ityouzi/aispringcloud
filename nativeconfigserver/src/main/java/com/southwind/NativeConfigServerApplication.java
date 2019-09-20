package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 22:35
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer             //声明配置中⼼
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
        System.out.println("配置文件启动。。。");
    }
}
