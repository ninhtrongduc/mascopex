package com.example.demo.dto;

public class ApiResponse <T>{
    private int code; //Mã lỗi
    private String message; //Mô tả lỗi
    private T result;
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }

    
}
