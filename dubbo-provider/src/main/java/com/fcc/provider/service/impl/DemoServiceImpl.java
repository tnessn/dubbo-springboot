package com.fcc.provider.service.impl;

import javax.annotation.Resource;

import org.dromara.hmily.annotation.Hmily;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.fcc.api.service.DemoService;
import com.fcc.provider.dao.entity.UserEntity;
import com.fcc.provider.dao.entity.UserEntityCriteria;
import com.fcc.provider.dao.mapper.UserMapper;

@Service(version = "1.0.0")
@Component
public class DemoServiceImpl implements DemoService {
	
	
	@Resource
	private UserMapper userMapper;
	

    @Override
    public String findAllUser() {
        return JSON.toJSONString(userMapper.selectByExample(null));
    }


	@Override
	@Hmily(confirmMethod = "confirm",cancelMethod = "cancel")
	public void updateUser(String age) {
		UserEntity record=new UserEntity();
		record.setAge(Byte.valueOf(age));
		UserEntityCriteria example=new UserEntityCriteria();
		example.createCriteria().andIdEqualTo(3L);
		userMapper.updateByExampleSelective(record, example);
	}
	
	
	public void confirm(String age) {
		System.out.println("确认");
	}
	
	public void cancel(String age) {
		System.out.println("取消");
	}

}
