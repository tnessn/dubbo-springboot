package com.fcc.provider.dao.mapper;

import com.fcc.provider.dao.entity.UserEntity;
import com.fcc.provider.dao.mapper.base.UserBaseMapper;

public interface UserMapper extends UserBaseMapper {

	UserEntity findByAge(String age);

	
}