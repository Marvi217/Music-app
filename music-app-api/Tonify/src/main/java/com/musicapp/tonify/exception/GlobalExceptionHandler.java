package com.musicapp.tonify.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<?> handleResourceNotFound(ResourceNotFoundException ex) {
        return null;
    }

    public ResponseEntity<?> handleUnauthorized(UnauthorizedException ex) {
        return null;
    }

    public ResponseEntity<?> handleRateLimit(RateLimitException ex) {
        return null;
    }

    public ResponseEntity<?> handleValidation(MethodArgumentNotValidException ex) {
        return null;
    }
}

