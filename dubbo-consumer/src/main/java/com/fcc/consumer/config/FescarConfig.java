package com.fcc.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;

@Configuration
public class FescarConfig {


    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("dubbo-consumer", "my_test_tx_group");
    }
}
