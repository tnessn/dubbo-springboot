package com.fcc.consumer.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.fcc.api.service.DemoService;
import com.fcc.consumer.service.UserService;


@Component
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{
	
	
    
    @Reference(version = "1.0.0")
    private DemoService demoService;
	

	@Override
	 @GlobalTransactional(timeoutMills = 300000, name = "dubbo-gts-fescar-example")
	public void updateUser(String age) {
		demoService.updateUser(age);		
	}
	
	
	
}
