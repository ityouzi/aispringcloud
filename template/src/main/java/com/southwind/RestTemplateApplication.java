package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 17:18
 * @Description:
 * @Version 1.0
 */


@SpringBootApplication
public class RestTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
        System.out.println("启动成功！");
    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
