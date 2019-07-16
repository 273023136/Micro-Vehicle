package com.in9090.user.server.test.controller;

import com.in9090.user.server.test.entity.TTest;
import com.in9090.user.server.test.service.TTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TTestService tTestService;

    @RequestMapping("/listTest")
    public List<TTest> test(Long id){
        List<TTest> tTests = tTestService.listTTest(id);
        return tTests ;
    }

    @RequestMapping("/test")
    public String test2(Long id){
        return  "哈哈哈"+id;
    }
}
