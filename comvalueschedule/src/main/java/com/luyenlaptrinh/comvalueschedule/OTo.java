package com.luyenlaptrinh.comvalueschedule;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OTo {
    @Value("${com.luyenlaptrinh.giatrivang}")
    private Integer vang;

    @Scheduled(fixedDelay=10000L)
    public void run(){
        System.out.println(vang);
    }
}
