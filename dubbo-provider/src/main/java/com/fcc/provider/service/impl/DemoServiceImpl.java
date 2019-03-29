package com.fcc.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fcc.api.service.DemoService;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
