package com.fcc.api.service;

import com.fcc.api.dto.TestDto;

/**
 * DemoService
 * 服务Api接口类
 * @author fcc
 * @date 2018/6/6
 */
public interface DemoService {

    String sayHello(String name);

    void performanceTest( TestDto testDto);
}
