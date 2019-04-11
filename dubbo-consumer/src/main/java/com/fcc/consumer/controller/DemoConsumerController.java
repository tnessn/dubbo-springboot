package com.fcc.consumer.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fcc.consumer.service.UserService;

@RestController
public class DemoConsumerController {

    @Resource
    private UserService userService;
    
    
    @RequestMapping("/updateUser/{age}")
    public void updateUser(@PathVariable String age) {
    	userService.updateUser(age);
    }

}
