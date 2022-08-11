package com.luyenlaptrinh.restfulapi.controller;

import com.luyenlaptrinh.restfulapi.payload.req.SachReq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//Viết 1 chương trình spring boot:
//1. Viết method GET, trả về 1 List<String>
//2. Viết method GET, với RequestParams: truongHoc, trả về đúng tên trường học đó
//3. Viết method GET với PathVariabe: lopHoc, rồi trả về tên lớp học đó.
//4. Viết method GET với RequestHeader: token, rồi trả về token đó.
//5. Viết method POST với body chứa 1 String, sau đó trả về giá trị của String đó
//6. Viết method PUT chứa PathVariable: id ,và body chứa 1 String. Sau đó trả về chuỗi id +""+ giá trị String đó
@RestController
@RequestMapping("/school")
public class SchoolController {
    @GetMapping("/list-string")
    public ResponseEntity<?> getListString(){
        List<String> result = Arrays.asList("Hung", "Khanh", "Toan");
        return ResponseEntity.ok(result);
    }

    @GetMapping("/truong-hoc")
    public ResponseEntity<?> getTruongHoc(@RequestParam String truongHoc){
        return ResponseEntity.ok(truongHoc);
    }

//    @RequestMapping(value = "/lop-hoc/{lopHoc}", method = RequestMethod.GET)
    @GetMapping(value = "/lop-hoc/{lopHoc}")
    public ResponseEntity<?> getLopHoc(@PathVariable String lopHoc){
        return ResponseEntity.ok(lopHoc);
    }

    @GetMapping( "/token")
    public ResponseEntity<?> getToken(@RequestHeader String token){
        return ResponseEntity.ok(token);
    }

    @PostMapping("/string-body")
    public ResponseEntity<?> createString(@RequestBody SachReq str){
        return ResponseEntity.ok(str.getName());
    }

    @PutMapping("/put-string-body/{id}")
    public ResponseEntity<?> changeSomeThing(@PathVariable String id, @RequestBody SachReq str){
        return ResponseEntity.ok(id +"  " + str.getName());

    }
}
