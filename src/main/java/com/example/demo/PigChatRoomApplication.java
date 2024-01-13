package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.example.demo.mapper")
@SpringBootApplication(scanBasePackages = "com.example.demo")
public class PigChatRoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(PigChatRoomApplication.class, args);
    }

}
