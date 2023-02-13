package com.example.cloud.eurekasecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecurityApplication.class, args);
    }

}
