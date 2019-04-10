package com.fcc.consumer.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fescar.core.context.RootContext;
import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.fcc.api.service.DemoService;
import com.fcc.consumer.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(UserServiceImpl.class);

    
    @Resource
    private DemoService demoService;
	

	@Override
	@GlobalTransactional
	public void updateUser(String age) {
		   System.out.println("开始全局事务，XID = " + RootContext.getXID());
		demoService.updateUser(age);		
		throw new RuntimeException();
	}
}
