package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 12:27
 * @Description:启动类
 * @Version 1.0
 */
@SpringBootApplication       //声明该类是boot的入口
@EnableEurekaServer          //声明该类是一个微服务，提供服务注册和服务发现功能即注册中心
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
        System.out.println("启动成功！！！");
    }
}
