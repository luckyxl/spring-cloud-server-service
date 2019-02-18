package com.xl.springclouddemoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description springcloud服务提供测试类
 * @Author xule
 * @Date 2019/2/12 11:29
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/helloworld")
    public String hello(){
        System.out.println("服务被调用");
        return "hello world";
    }

}
