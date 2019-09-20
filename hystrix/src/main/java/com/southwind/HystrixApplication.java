package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 22:00
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker               //声明启用数据监控
@EnableHystrixDashboard             //声明启用数据可视化监控
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
        System.out.println("监控启动");
    }
}
