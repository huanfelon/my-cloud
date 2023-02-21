package com.example.cloud.seataaccountservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.cloud.seataaccountservice.dao"})
public class MyBatisConfig {
}
