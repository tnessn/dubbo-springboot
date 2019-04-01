package com.fcc.provider.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fcc.api.service.DemoService;

@RestController
public class DemoProviderController {

    @Resource
    private DemoService demoService;
    
    

    @RequestMapping("/getNameByAge")
    String getNameByAge(@RequestParam String age,@RequestParam(defaultValue = "0") long millisecond) {
    	return demoService.getNameByAge(age, millisecond);
    }
    
    
    @RequestMapping("/updateByAge")
    void updateByAge(@RequestParam String age,@RequestParam String name) {
    	demoService.updateByAge(age, name);
    }
   
}
