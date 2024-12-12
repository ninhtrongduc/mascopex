package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice    //Khai báo đây là nơi quản lý tất cả các exception
public class GlobalExceptionHandler {
    @ExceptionHandler(value = RuntimeException.class)  //Bắt tất cả các lỗi thuộc về RuntimeException
    ResponseEntity<String> handlingRuntimeException(RuntimeException runtimeException){
        //Đây là một hàm kiểu ResponseEntity nên trả về kiểu ResponseEntity
        //Lỗi ở đây trả về là các kiểu như error 400, 500,...nên badRequest()
        //phần nội dung body() nó lấy Message của các lỗi thuộc về dạng RuntimeException
        return ResponseEntity.badRequest().body(runtimeException.getMessage());
    }
}
