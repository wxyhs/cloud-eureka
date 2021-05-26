package com.wxy.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wxy
 * @Description:测试配置中心
 * @Date created in 14:19 2021/5/26
 */
@RestController
public class HelloController {

    @Value("${wxy.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from(){
        return this.hello;
    }
}
