package com.wxy.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @Author: Wxy
 * @Description:调用eureka-client服务的接口
 * @Date created in 11:57 2021/4/30
 */
@Component
@FeignClient(value = "eureka-client",fallbackFactory = FeignServiceHystrix.class)
public interface FeignService {

    /**
     * 调用 eureka-client服务的 /sayHello方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHeiFromClient(@RequestParam("name") String name);
}
