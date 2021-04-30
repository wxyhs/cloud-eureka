package com.wxy.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 11:45 2021/4/30
 */
@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public String hello(@RequestParam String name){
        return "hello"+name+":8080";
    }

}
