package com.musicapp.tonify.controller;

import com.musicapp.tonify.dto.request.LoginRequest;
import com.musicapp.tonify.dto.request.RegisterRequest;
import org.springframework.http.ResponseEntity;

import java.security.Principal;

public class AuthController {

    public ResponseEntity<?> register(RegisterRequest request) {
        return null;
    }

    public ResponseEntity<?> login(LoginRequest request) {
        return null;
    }

    public ResponseEntity<?> logout(String token) {
        return null;
    }

    public ResponseEntity<?> deleteAccount(Principal principal) {
        return null;
    }
}

