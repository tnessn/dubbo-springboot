package com.fcc.consumer.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.fcc.api.service.DemoService;
import com.fcc.consumer.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(UserServiceImpl.class);

    
    @Resource
    private DemoService demoService;
	

	@Override
	public void updateUser(String age) {
		demoService.updateUser(age);		
		System.out.println(1/0);
	}
	
	public void confirm(String age) {
		LOG.info("消费者confirm");
	}
	
	public void cancel(String age) {
		LOG.info("消费者cancel");
	}
	
}
