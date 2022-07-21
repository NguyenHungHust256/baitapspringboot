package com.luyenlaptrinh.baitapspringboot.service.imp;

import com.luyenlaptrinh.baitapspringboot.entities.HangHoa;
import com.luyenlaptrinh.baitapspringboot.service.TimKiem;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class QuanLyTimKiem implements TimKiem {
    public List<HangHoa> timKiemHangHoaCuaKhach(String maKhachHang) {
//        xu ly logic de lay ra hang hoa
        List<HangHoa> hangHoas = new ArrayList<>();
        hangHoas.add(new HangHoa("BapCai", 2, "100.000 VND"));
        return hangHoas;
    }
}
