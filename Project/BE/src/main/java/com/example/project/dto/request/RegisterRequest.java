package com.example.project.dto.request;
import com.example.project.entity.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegisterRequest {

    @Column(name = "full_name", columnDefinition = "NVARCHAR(100)")
    private String fullName;

    @Column(columnDefinition = "NVARCHAR(20)")
    private String phone;

    @Column(columnDefinition = "NVARCHAR(255)")
    private String address;

    @Email(message = "Invalid email address")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 1, message = "Password must be at least 1 characters long")
    private String password;

}

