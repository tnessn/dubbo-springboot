package com.fcc.provider.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fescar.core.context.RootContext;
import com.fcc.api.service.DemoService;
import com.fcc.provider.dao.entity.UserEntity;
import com.fcc.provider.dao.entity.UserEntityCriteria;
import com.fcc.provider.dao.mapper.UserMapper;


@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
	
	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(DemoServiceImpl.class);
	
	
	@Resource
	private UserMapper userMapper;
	


	@Override
	public void updateUser(String age) {
		System.out.println("全局事务id ：" + RootContext.getXID());
		UserEntity record=new UserEntity();
		record.setAge(Byte.valueOf(age));
		UserEntityCriteria example=new UserEntityCriteria();
		example.createCriteria().andIdEqualTo("3");
		userMapper.updateByExampleSelective(record, example);
	}
	
	@Override
	public void createUser(String age) {
		System.out.println("全局事务id ：" + RootContext.getXID());
		UserEntity record=new UserEntity();
		record.setAge(Byte.valueOf(age));
		record.setName("jhjh");
		record.setId(age);
		userMapper.insertSelective(record);
	}
	
	

}
