package com.luyenlaptrinh.baitapspringboot.service;

import com.luyenlaptrinh.baitapspringboot.entities.HangHoa;

import java.util.List;

public interface TimKiem {
    List<HangHoa> timKiemHangHoaCuaKhach(String maKhachHang);
}
