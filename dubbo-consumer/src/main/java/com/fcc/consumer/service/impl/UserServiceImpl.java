package com.fcc.consumer.service.impl;

import org.dromara.hmily.annotation.Hmily;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.fcc.api.service.DemoService;
import com.fcc.consumer.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{
	
	
    
    @Reference(version = "1.0.0")
    private DemoService demoService;
	

	@Override
	@Hmily(confirmMethod = "confirm",cancelMethod = "cancel")
	public void updateUser(String age) {
		demoService.updateUser(age);		
	}
	
	
	public void confirm(String age) {
		System.out.println("确认");
	}
	
	public void cancel(String age) {
		System.out.println("取消");
	}
	
	
}
