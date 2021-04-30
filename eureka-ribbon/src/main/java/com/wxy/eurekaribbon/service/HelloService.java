package com.wxy.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 11:04 2021/4/30
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    private final static String URL = "http://eureka-client/sayHello?name=";

    /**
     * 使用程序名直接调用接口
     * @param name
     * @return
     */
    public String helloService(String name) {
        return restTemplate.getForObject(URL + name, String.class);
    }
}
