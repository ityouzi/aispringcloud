package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 22:51
 * @Description:
 * @Version 1.0
 */
@RestController
@RequestMapping("/native")
public class NativeConfigController {

    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;


    @GetMapping("/index")
    public String index(){
        return this.port+"-----"+this.foo;
    }


}
