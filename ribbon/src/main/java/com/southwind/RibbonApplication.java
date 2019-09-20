package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 19:05
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
        System.out.println("ribbon启动成功！！！");
    }


    @Bean
    @LoadBalanced    //声明⼀个基于 Ribbon 的负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
