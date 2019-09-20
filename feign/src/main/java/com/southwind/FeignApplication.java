package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 21:26
 * @Description: feign客户端
 * @Version 1.0
 */

@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
        System.out.println("Feign启动成功");
    }
}
