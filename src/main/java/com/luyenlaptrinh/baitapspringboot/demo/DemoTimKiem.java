package com.luyenlaptrinh.baitapspringboot.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luyenlaptrinh.baitapspringboot.service.TimKiem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoTimKiem {
    @Autowired
    @Qualifier("quanLyTimKiem")
    private TimKiem timKiem;

    @Scheduled(fixedDelay = 1000L)
    public void run(){
        try {
            log.info("nhanVienTimKiem: {}", new ObjectMapper().writeValueAsString(timKiem.timKiemHangHoaCuaKhach("A")));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
