package com.southwind.feign;

import com.southwind.entity.Student;
import com.southwind.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Auther: Liberal-World
 * @Date: 2019-09-20 21:29
 * @Description: 声明式接口
 * @Version 1.0
 */

// value 说明访问的服务提供者。
@FeignClient(value = "provider",fallback = FeignError.class)
public interface  FeignProviderClient {

    // 只需要生命接口，通过注解完成映射
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();


}
