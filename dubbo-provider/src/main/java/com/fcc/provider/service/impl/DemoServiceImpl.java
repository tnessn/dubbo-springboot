package com.fcc.provider.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fescar.core.context.RootContext;
import com.fcc.api.service.DemoService;
import com.fcc.provider.dao.entity.UserEntity;
import com.fcc.provider.dao.entity.UserEntityCriteria;
import com.fcc.provider.dao.mapper.UserMapper;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
	
	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(DemoServiceImpl.class);
	
	
	@Resource
	private UserMapper userMapper;
	

    @Override
    public String findAllUser() {
        return JSON.toJSONString(userMapper.selectByExample(null));
    }


	@Override
	public void updateUser(String age) {
		System.out.println("全局事务id ：" + RootContext.getXID());
		UserEntity record=new UserEntity();
		record.setAge(Byte.valueOf(age));
		UserEntityCriteria example=new UserEntityCriteria();
		example.createCriteria().andIdEqualTo(3L);
		userMapper.updateByExampleSelective(record, example);
	}
	
	public void confirm(String age) {
		LOG.info("provider confirm");
	}
	
	public void cancel(String age) {
		LOG.info("provider cancel");
	}


    /**
     * 测试数据库隔离级别
     */
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public String getNameByAge(String age,long millisecond) {
		UserEntity user = userMapper.findByAge(age);
		
		
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return user.getName();
    }
	
    
    
    /**
     * 测试数据库隔离级别
     */
    @Override
    @Transactional
    public void updateByAge(String age,String name) {
    	UserEntityCriteria example=new UserEntityCriteria();
    	example.createCriteria().andAgeEqualTo(Byte.valueOf(age));
		UserEntity userEntity=new UserEntity();
		userEntity.setName(name);
		 userMapper.updateByExampleSelective(userEntity,example);
    }
    

}
