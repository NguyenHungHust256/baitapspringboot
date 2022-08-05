package com.luyenlaptrinh.restfulapi.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.luyenlaptrinh.restfulapi.payload.req.PostReq;
import com.luyenlaptrinh.restfulapi.payload.req.SachReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

//    Buoi 2
//    @RequestParams
    @GetMapping(value = "demo-params")
    public ResponseEntity<?> demoParams(@RequestParam(required = true) String name){
//        xu ly tim kiem mon toan
        return ResponseEntity.ok().body("Da xu ly: " + name);
    }

    //    @RequestHeader
    @GetMapping(value = "demo-header")
    public ResponseEntity<?> demoHeader(@RequestHeader String randBien){
//        xu ly randBien
        return ResponseEntity.ok().body("Da xu ly: " + randBien);
    }

    //    @PathVariable
    @GetMapping(value = "demo-path-variable/{id}")
    public ResponseEntity<?> demoPathVariable(@PathVariable String id){
//        xu ly randBien
        return ResponseEntity.ok().body("Da xu ly: " + id);
    }

//    Demo PostMapping
    @PostMapping(value = "demo-post-v1")
    public ResponseEntity<?> demoPostV1(@RequestBody PostReq request){
//        xu ly request
        return ResponseEntity.ok().body(request);
    }

//    Demo PostMapping
    @RequestMapping(value = "demo-post-v2", method = RequestMethod.POST)
    public ResponseEntity<?> demoPostV2(@RequestBody PostReq request){
//        xu ly request
        return ResponseEntity.ok().body(request);
    }

//    Demo PutMapping
    @PutMapping(value = "/demo-put/{bien}")
    public ResponseEntity<?> demoPut(@PathVariable String bien, @RequestBody SachReq req){
//        cap nhap lai ten sach co id la bien
        return ResponseEntity.ok().body("Xu ly cho id: " + bien +" voi ten moi la: "+ req.getName());
    }

    //    Demo DeleteMapping
    @DeleteMapping(value = "/demo-delete/{bien}")
    public ResponseEntity<?> demoDelete(@PathVariable String bien, @RequestBody SachReq req){
//        cap nhap lai ten sach co id la bien
        return ResponseEntity.ok().body("Xu ly xoa cho id: " + bien +" voi ten moi la: "+ req.getName());
    }
}
