package com.luyenlaptrinh.baitapspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BaitapspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaitapspringbootApplication.class, args);
    }

}
