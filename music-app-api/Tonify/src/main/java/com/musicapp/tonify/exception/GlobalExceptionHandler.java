package com.musicapp.tonify.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<?> handleResourceNotFound(ResourceNotFoundException ex) {
        return null;
    }

    @ExceptionHandler
    public ResponseEntity<?> handleUnauthorized(UnauthorizedException ex) {
        return null;
    }

    @ExceptionHandler
    public ResponseEntity<?> handleRateLimit(RateLimitException ex) {
        return null;
    }

    @ExceptionHandler
    public ResponseEntity<?> handleValidation(MethodArgumentNotValidException ex) {
        return null;
    }

    @ExceptionHandler
    public ResponseEntity<?> UserAlreadyExistsException(UserAlreadyExistsException ex) {
        return ResponseEntity.status(409).body(ex.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<?> InvalidCredentialsException(InvalidCredentialsException ex) {
        return ResponseEntity.status(401).body(ex.getMessage());
    }
}

