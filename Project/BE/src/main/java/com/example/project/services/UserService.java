package com.example.project.services;

import com.example.project.dto.request.LoginRequestDTO;
import com.example.project.dto.response.LoginResponseDTO;


public interface UserService {
    LoginResponseDTO login(LoginRequestDTO request);
}
