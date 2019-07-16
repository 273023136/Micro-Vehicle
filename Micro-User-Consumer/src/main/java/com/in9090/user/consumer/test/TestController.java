package com.in9090.user.consumer.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 * rest+ribbon 调用
 */


@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/test/{id}")
    public Object test(@PathVariable Long id){
        return restTemplate.getForObject("http://micro-user-server/listTest?id="+id,Object.class);
    }


}
