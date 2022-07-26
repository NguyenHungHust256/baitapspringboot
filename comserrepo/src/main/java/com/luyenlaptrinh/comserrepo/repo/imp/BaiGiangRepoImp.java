package com.luyenlaptrinh.comserrepo.repo.imp;

import com.luyenlaptrinh.comserrepo.repo.BaiGiangRepo;
import org.springframework.stereotype.Repository;

@Repository
public class BaiGiangRepoImp implements BaiGiangRepo {
    @Override
    public String getTenBaiGiangMon(String tenMon) {
//        thuc hien lay trong database da xong
        return "Bai Giang Mon " + tenMon;
    }
}
