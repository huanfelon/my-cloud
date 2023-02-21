package com.example.cloud.seataorderservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.cloud.seataorderservice.dao"})
public class MyBatisConfig {
}
