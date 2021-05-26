package com.wxy.eurekaclient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@SpringBootTest
class EurekaClientApplicationTests {

    @Test
    void contextLoads() {
        AtomicLong var = new AtomicLong(0);
        System.out.println(var.incrementAndGet());
    }

}
