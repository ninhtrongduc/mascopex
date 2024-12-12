package com.example.demo.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class UserCreationRequest {
    //DTO là một lớp trung gian giữa mapping Entity cho các Service hoặc Repository xử lý
    //Không cần lấy id vì do đã generated sẵn dạng UUID rồi
    //private String id;
    private String username;

    @Size(min = 8, message = "Mật khẩu tối thiểu 8 ký tự")
    private String password;
    /*  @NotNull – kiểm tra giá trị null
@AssertTrue – kiểm tra giá trị thuộc tính là true
@Size – kiểm tra độ dài min and max
@Min – kiểm tra giá trị nhỏ nhất
@Max – Kiểm tra giá trị lớn nhất
@Email – kiểm tra email có hợp lệ
@NotEmpty – kiểm tra không được trống và empty
@NotBlank – kiểm tra giá trị không được null hoặc khoảng trắng
@Positive and @PositiveOrZero – kiểm tra chỉ được phép là số nguyên dương từ 0 trở đi
@Negative and @NegativeOrZero – kiểm tra số âm
@Past and @PastOrPresent – kiểm tra ngày từ quá khứ đến hiện tại.
@Future and @FutureOrPresent – kiểm tra ngày từ hiện tại đến tương lai
 */
    
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
