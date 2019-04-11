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
    
    
   
}
