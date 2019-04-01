package com.fcc.consumer.service.impl;

import javax.annotation.Resource;

import org.dromara.hmily.annotation.Hmily;
import org.springframework.stereotype.Service;

import com.fcc.api.service.DemoService;
import com.fcc.consumer.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	
    
    @Resource
    private DemoService demoService;
	

	@Override
	@Hmily(confirmMethod = "confirm",cancelMethod = "cancel")
	public void updateUser(String age) {
		demoService.updateUser(age);		
	}
	
	public void confirm(String age) {
		System.out.println("消费者confirm");
	}
	
	public void cancel(String age) {
		System.out.println("消费者cancel");
	}
	
}
