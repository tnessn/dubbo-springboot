package com.fcc.api.service;

public interface DemoService {

	String findAllUser();
	
	void updateUser(String age);

	String getNameByAge(String age,long millisecond);

	void updateByAge(String age, String name);


}
