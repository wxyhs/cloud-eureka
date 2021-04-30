package com.wxy.eurekaribbon.controller;

import com.wxy.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 11:07 2021/4/30
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        System.out.println("进入HelloController======================>param:" + name);
        return helloService.helloService(name);
    }
}
