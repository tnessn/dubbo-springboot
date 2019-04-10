package com.fcc.provider.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;

@Configuration
public class FescarConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource(){
        return new DruidDataSource();
    }

    @Primary
    @Bean("dataSource")
    public DataSourceProxy dataSourceProxy(DruidDataSource druidDataSource){
        return new DataSourceProxy(druidDataSource);
    }

    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("dubbo-consumer", "my_test_tx_group");
    }
}
