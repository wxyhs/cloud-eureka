package com.wxy.servicefeign.service;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: Wxy
 * @Description:FeignService的失败回调类
 * @Date created in 14:01 2021/5/8
 */
@Component
public class FeignServiceHystrix implements FallbackFactory {

    @Override
    public FeignService create(Throwable cause) {
        return new FeignService() {
            @Override
            public String sayHeiFromClient(String name) {
                return "该服务暂时关闭，敬请谅解";
            }
        };
    }
}
