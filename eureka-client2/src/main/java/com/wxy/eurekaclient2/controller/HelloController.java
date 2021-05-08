package com.wxy.eurekaclient2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "hystrixHello")
    public String hello(@RequestParam String name){
        if ("wxy".equals(name)) {
            throw new RuntimeException();
        }
        return "hello"+name+":8062";
    }

    /**
     * Hystrix熔断器备用方法，当上述方法不可用时调用此方法迅速返回信息，实现服务熔断，不至于服务雪崩
     * @param name
     * @return
     */
    public String hystrixHello(@RequestParam String name){
        return "该接口暂时无法访问";
    }
}
