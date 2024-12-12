package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    //findBy: Truy vấn dựa trên các thuộc tính Entity
    //countBy: Đếm số lượng Entity thỏa mãn điều kiện
    //deleteBy: Xóa các entity thỏa đk
    //existsBy: kiểm tra sự tồn tại của các entity
    boolean existsByUsername(String username); //Phải là existBy + thỏa mãn điều kiện của Entity
}
