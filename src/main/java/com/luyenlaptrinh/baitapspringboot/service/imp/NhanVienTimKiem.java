package com.luyenlaptrinh.baitapspringboot.service.imp;

import com.luyenlaptrinh.baitapspringboot.entities.HangHoa;
import com.luyenlaptrinh.baitapspringboot.service.TimKiem;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NhanVienTimKiem implements TimKiem {
    public List<HangHoa> timKiemHangHoaCuaKhach(String maKhachHang) {
        List<HangHoa> hangHoas = new ArrayList<>();
        hangHoas.add(new HangHoa("KemDanhRang", 1));
        return hangHoas;
    }
}
