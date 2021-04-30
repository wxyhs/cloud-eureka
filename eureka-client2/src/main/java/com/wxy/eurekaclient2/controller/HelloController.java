package com.wxy.eurekaclient2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 11:44 2021/4/30
 */
@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public String hello(@RequestParam String name){
        return "hello"+name+":8062";
    }
}
