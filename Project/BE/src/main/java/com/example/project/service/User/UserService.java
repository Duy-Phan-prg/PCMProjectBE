package com.example.project.service.User;

import com.example.project.dto.request.LoginRequestDTO;
import com.example.project.dto.response.LoginResponseDTO;


public interface UserService {
    LoginResponseDTO login(LoginRequestDTO request);
}
