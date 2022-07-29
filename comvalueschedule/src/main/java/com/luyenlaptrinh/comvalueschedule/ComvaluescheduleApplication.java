package com.luyenlaptrinh.comvalueschedule;

import com.luyenlaptrinh.other.Xe;
import com.luyenlaptrinh.other2.Banh;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class ComvaluescheduleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ComvaluescheduleApplication.class, args);
        try{
            OTo oTo = context.getBean(OTo.class);
            log.info("Can get bean OTo");
        }catch (Exception e){
            log.error("Can not get bean OTo, {}", e.getMessage());
        }
    }
}
