package com.luyenlaptrinh.restfulapi.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hoc-sinh")
public class StudentController {
//C1: dung @GetMapping
    @GetMapping("/danh-sach-hoc-sinh")
    public ResponseEntity<?> getDanhSachHocSinh(){
        return ResponseEntity.ok("Lay danh sach hoc sinh thanh cong");
    }
// C2: Su dung @RequestMapping
    @RequestMapping(value = "/danh-sach-hoc-sinh-v2", method = RequestMethod.GET)
    public ResponseEntity<?> getDanhSachHocSinhV2(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Lay danh sach hoc sinh that bai");
    }


    // Khai bao nhieu duong dan
    @RequestMapping(value = {"/danh-sach-hoc-sinh-v3", "danh-sach-v1"}, method = RequestMethod.GET)
    public ResponseEntity<?> getDanhSachHocSinhV3(){
        return ResponseEntity.ok("Test cung duong dan");
    }
}
