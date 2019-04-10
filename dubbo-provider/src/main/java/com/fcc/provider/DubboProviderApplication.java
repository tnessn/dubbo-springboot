package com.fcc.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.fcc.provider.dao.mapper")
@ImportResource(locations = "spring-dubbo.xml")
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
