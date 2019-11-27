package com.in9090.user.consumer.test.controller;

import com.in9090.user.consumer.test.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign 调用
 */
@RestController
public class TestFeignController {

    @Autowired
    TestFeignService testFeignService;



    @RequestMapping(value = "/testFeign",method = RequestMethod.GET)
    public Object test(@RequestParam Long id){
        return testFeignService.select(id);
    }

}
