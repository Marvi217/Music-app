package com.musicapp.tonify.service;

import com.musicapp.tonify.dto.request.LoginRequest;
import com.musicapp.tonify.dto.request.RegisterRequest;
import com.musicapp.tonify.dto.response.AuthResponse;
import com.musicapp.tonify.exception.InvalidCredentialsException;
import com.musicapp.tonify.exception.UserAlreadyExistsException;
import com.musicapp.tonify.model.entity.User;
import com.musicapp.tonify.model.enums.UserRole;
import com.musicapp.tonify.repository.UserRepository;
import io.jsonwebtoken.IncorrectClaimException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final RedisTemplate<String, Object> redisTemplate;
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse register(RegisterRequest request) {
        Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());
        if(optionalUser.isEmpty()){
            User user = User.builder()
                    .id(UUID.randomUUID())
                    .email(request.getEmail())
                    .passwordHash(passwordEncoder.encode(request.getPassword()))
                    .role(UserRole.USER)
                    .build();
            userRepository.save(user);
            return AuthResponse.builder()
                    .accessToken(jwtService.generateToken(user.getId()))
                    .refreshToken(null)
                    .build();
        }
        throw new UserAlreadyExistsException("User already exists");
    }

    public AuthResponse login(LoginRequest request) {
        Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());
        if(optionalUser.isPresent()){
            User user = optionalUser.orElseThrow();
            return AuthResponse.builder()
                    .accessToken(jwtService.generateToken(user.getId()))
                    .refreshToken(null)
                    .build();
        }
        throw new InvalidCredentialsException("Incorrect cridencial");
    }

    public void logout(String token) {
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        if (jwtService.isTokenValid(token)) {
            long ttl = jwtService.getExpirationTime(token);
            redisTemplate.opsForValue().set("blacklist:" + token, "true", ttl, TimeUnit.MILLISECONDS);
        }
    }

    public void deleteAccount(Principal principal) {
        Authentication authentication = (Authentication) principal;
        UUID userId = (UUID) authentication.getPrincipal();
        assert userId != null;
        User user = userRepository.findById(userId).orElseThrow();
        userRepository.delete(user);

    }
}
