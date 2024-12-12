package com.example.demo.dto;

import java.time.LocalDate;


public class UserUpdateRequest {
    //DTO là một lớp trung gian giữa mapping Entity cho các Service hoặc Repository xử lý
    //DTO chọn ra các thuộc tính của Entity cần lấy mà ko nhất thiết tất cả
    //Không cần lấy id vì do đã generated sẵn dạng UUID rồi
    //private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dayofbirth;


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDayofbirth() {
        return dayofbirth;
    }
    public void setDayofbirth(LocalDate dayofbirth) {
        this.dayofbirth = dayofbirth;
    }
    
}
