package com.in9090.user.consumer.test.service.impl;

import com.in9090.user.consumer.test.service.TestFeignService;
import org.springframework.stereotype.Component;

@Component
public class TestFeignServiceHystric implements TestFeignService {
    @Override
    public Object listTest(Long id) {
        return "异常";
    }
}
