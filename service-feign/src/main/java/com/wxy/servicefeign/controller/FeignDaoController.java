package com.wxy.servicefeign.controller;

import com.wxy.servicefeign.service.FeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 12:00 2021/4/30
 */
@RestController
public class FeignDaoController {

    private static Logger logger = LoggerFactory.getLogger(FeignDaoController.class);

    @Autowired
    FeignService feignService;

    /**
     * Test远程调用
     * @param name
     * @return
     */
    @GetMapping("/feignSayHello")
    public String sayHi(@RequestParam String name){
        logger.info("Feign开始进行远程调用---------------->参数为：{}",name);
        return feignService.sayHeiFromClient(name);
    }
}
