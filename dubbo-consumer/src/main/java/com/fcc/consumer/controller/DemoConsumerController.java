package com.fcc.consumer.controller;

import javax.annotation.Resource;

import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fcc.api.service.DemoService;
import com.fcc.consumer.service.UserService;

@RestController
public class DemoConsumerController {

    @Resource
    private UserService userService;
    
    
    @Reference(version = "1.0.0")
    private DemoService demoService;
    
    
    @RequestMapping("")
    public String hello() {
        return "hello";
    }
    

    @RequestMapping("/findAllUser")
    public String sayHello() {
        return demoService.findAllUser();
    }
    
    @RequestMapping("/updateUser/{age}")
    public void updateUser(@PathVariable String age) {
    	userService.updateUser(age);
    }

    @RequestMapping("/getNameByAge")
    String getNameByAge(@RequestParam String age,@RequestParam(defaultValue = "0") long millisecond) {
    	return demoService.getNameByAge(age, millisecond);
    }
   
}
