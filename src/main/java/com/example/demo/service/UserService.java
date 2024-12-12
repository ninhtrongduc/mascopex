package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserCreationRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    //De goi Repository thi no phai khai bao @Autowired
    @Autowired
    private UserRepository userRepository;

    //Ham return mot kieu UserCreationRequest voi request thuoc lop User entity
    public User createRequest(UserCreationRequest request){
        //Tao mot entity moi va mapping cac du lieu lay tu trong Entity User voi doi tuong request
        User user=new User();

        //Kiểm tra username có tồn tại không?
        if (userRepository.checkExistUsername(request.getUsername())) {
            throw new RuntimeException("User đã tồn tại!");
        }

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDayofbirth(request.getDayofbirth());

        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Service: Không tìm thấy user"));
    }
    //UPDATE by ID, truyền vào ID và các trường của DTO UserUpdateRequest cần thay đổi
    public User updateUser(String userID, UserUpdateRequest dto){
        //Dùng lại user ở bên trên vì nó khai báo public
        //Hàm getUser là gọi lại ở bên trên
        User user=getUser(userID);
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setDayofbirth(dto.getDayofbirth());
        return userRepository.save(user);
    }

    //DELETE
    public void deleteUser(String s_id){
        userRepository.deleteById(s_id);
    }
}
