package com.musicapp.tonify.controller;

import com.musicapp.tonify.dto.request.LoginRequest;
import com.musicapp.tonify.dto.request.RegisterRequest;
import com.musicapp.tonify.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader("Authorization") String token) {
        authService.logout(token);
       return null;
    }

    @PostMapping("/delete")
    public ResponseEntity<?> deleteAccount(Principal principal) {
        authService.deleteAccount(principal);
        return null;
    }
}

