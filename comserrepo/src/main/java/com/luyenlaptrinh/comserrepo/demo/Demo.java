package com.luyenlaptrinh.comserrepo.demo;

import com.luyenlaptrinh.comserrepo.service.BaiGiangService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Demo {
    @Autowired
    private BaiGiangService baiGiangService;

    @Scheduled(fixedDelay = 10000L)
    public void run(){
        log.info(baiGiangService.xuLyLayBaiGiangMonHoc("Mon Toan", "Lop 10A2"));
    }
}
