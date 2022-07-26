package com.luyenlaptrinh.comserrepo.service.imp;

import com.luyenlaptrinh.comserrepo.repo.BaiGiangRepo;
import com.luyenlaptrinh.comserrepo.service.BaiGiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaiGiangServiceImp implements BaiGiangService {
    @Autowired
    private BaiGiangRepo baiGiangRepo;

    @Override
    public String xuLyLayBaiGiangMonHoc(String tenMon, String tenLop) {
//        lay ten bai giang
//        xu ly lay ten mon hoc + Lop
        String tenBaiGiang = baiGiangRepo.getTenBaiGiangMon(tenMon);

        String ketQua = tenBaiGiang + " " + tenLop;
        return ketQua;
    }
}
