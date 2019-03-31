package com.fcc.provider.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.fcc.api.service.DemoService;
import com.fcc.provider.dao.entity.UserEntity;
import com.fcc.provider.dao.entity.UserEntityCriteria;
import com.fcc.provider.dao.mapper.UserMapper;

@Component
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
	
	
	@Resource
	private UserMapper userMapper;
	

    @Override
    public String findAllUser() {
        return JSON.toJSONString(userMapper.selectByExample(null));
    }


	@Override
	public void updateUser(String age) {
		UserEntity record=new UserEntity();
		record.setAge(Byte.valueOf(age));
		UserEntityCriteria example=new UserEntityCriteria();
		example.createCriteria().andIdEqualTo(3L);
		userMapper.updateByExampleSelective(record, example);
	}
	
	

}
