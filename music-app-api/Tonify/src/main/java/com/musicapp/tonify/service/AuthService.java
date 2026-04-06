package com.musicapp.tonify.service;

import com.musicapp.tonify.dto.request.LoginRequest;
import com.musicapp.tonify.dto.request.RegisterRequest;
import com.musicapp.tonify.dto.response.AuthResponse;
import com.musicapp.tonify.model.entity.User;

import java.util.UUID;

public class AuthService {

    public AuthResponse register(RegisterRequest request) {
        return null;
    }

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public void logout(String token) {
    }

    public void deleteAccount(UUID userId) {
    }

    private String generateTokens(User user) {
        return "";
    }
}
