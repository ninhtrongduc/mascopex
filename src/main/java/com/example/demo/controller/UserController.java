package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserCreationRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
//@RequestMapping("/users")    //Neu xoa thi trong cac method phai tu dat Endpoint rieng bang @Pos/GetMapping
public class UserController {
    //Goi den service nao thi @Autowired service do
    @Autowired
    private UserService userService;

    @PostMapping("/post")
    //Dua thong tin vao va tao user
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createRequest(request);
    }

    //Lay thong tin tất cả ra bang cach goi service tuong ung
    @GetMapping("/get")
    List<User> getUsers(){
        return userService.getUsers();
    }

    //Chi lay thong tin 1 user thong qua ID
    @GetMapping("/{userID}") //truyen ID thi phai nam trong moc ngoac
    //Mapping biến {userID} vào String userID
    User getUser(@PathVariable("userID") String userID){
        return userService.getUser(userID);
    }

    //UPDATE User
    @PutMapping("/{userID}") //Update user với ID truyền vào
    //Gọi hàm updateUser (id, dto) trong layer Service
    User updateUser(@PathVariable("userID") String userID , @RequestBody UserUpdateRequest dtoRequest){
        return userService.updateUser(userID, dtoRequest);
    }

    //DELETE USER
    @DeleteMapping("/{userID}")
    String deleteUser(@PathVariable String userID){
        userService.deleteUser(userID);
        return "Controller: Đã xóa thành công";
    }
}
