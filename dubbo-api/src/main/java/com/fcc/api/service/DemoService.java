package com.fcc.api.service;

import org.dromara.hmily.annotation.Hmily;

public interface DemoService {

	String findAllUser();
	
	@Hmily
	void updateUser(String age);

	String getNameByAge(String age,long millisecond);

	void updateByAge(String age, String name);


}
