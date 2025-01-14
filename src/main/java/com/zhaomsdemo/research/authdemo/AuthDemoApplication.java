package com.zhaomsdemo.research.authdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
public class AuthDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthDemoApplication.class, args);
    }

}
