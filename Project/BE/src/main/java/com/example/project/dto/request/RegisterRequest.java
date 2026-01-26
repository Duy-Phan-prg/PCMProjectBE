package com.example.project.dto.request;
import com.example.project.entity.Role;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegisterRequest {

    @NotBlank(message = "Họ và tên là bắt buộc")
    @Pattern(
            regexp = "^[\\p{L} ]+$",
            message = "Họ và tên chỉ được chứa chữ cái và khoảng trắng"
    )
    private String fullName;

    @NotBlank(message = "Số điện thoại là bắt buộc")
    @Pattern(
            regexp = "^(\\+84|0)\\d{9,10}$",
            message = "Số điện thoại không hợp lệ"
    )
    private String phone;

    @NotBlank(message = "Địa chỉ là bắt buộc")
    private String address;

    @Email(message = "Email is invalid")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotNull(message = "Role is required")
    private Role role;

}

