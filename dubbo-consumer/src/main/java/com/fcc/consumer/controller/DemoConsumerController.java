package com.fcc.consumer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fcc.api.service.DemoService;

@RestController
public class DemoConsumerController {

    @Reference(version = "1.0.0")
    private DemoService demoService;
    
    
    @RequestMapping("")
    public String hello() {
        return "hello";
    }
    

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }

   
}
