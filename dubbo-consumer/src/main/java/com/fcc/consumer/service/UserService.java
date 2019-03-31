package com.fcc.consumer.service;

import org.dromara.hmily.annotation.Hmily;

public interface UserService {
	
	
	@Hmily
	public void updateUser(String age) ;
}
