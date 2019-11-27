package com.in9090.user.consumer.test.service;

import com.in9090.user.consumer.test.service.impl.TestFeignServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * feign +Hystric 基本做法
 */
@FeignClient(value="micro-user-server",fallback = TestFeignServiceHystric.class ) //需要配置文件开启feign.hystrix.enabled=true
public interface TestFeignService  {


    @RequestMapping(value = "/listTest",method = RequestMethod.GET)
    Object listTest(@RequestParam("id")  Long id);
}
