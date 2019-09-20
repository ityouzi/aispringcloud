package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 18:20
 * @Description: 网关启动类，Zuul ⾃带了负载均衡功能，
 * @Version 1.0
 */
@EnableZuulProxy                //包含了 @EnableZuulServer ，设置该类是⽹关的启动类。
@EnableAutoConfiguration        //自动装载
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
        System.out.println("网关启动成功！！");
    }
}
