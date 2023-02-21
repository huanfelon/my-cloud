package com.example.cloud.seatastorageservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.cloud.seatastorageservice.dao"})
public class MyBatisConfig {
}
