package com.musicapp.tonify.controller;

import com.musicapp.tonify.dto.request.AudioUploadRequest;
import com.musicapp.tonify.dto.response.AudioUrlResponse;
import com.musicapp.tonify.model.entity.User;
import com.musicapp.tonify.service.AudioService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/audio")
public class AudioController {

    private final AudioService audioService;

    @GetMapping
    public ResponseEntity<?> getAudioUrl(@RequestParam UUID id, Principal principal) {
        Authentication authentication = (Authentication) principal;
        UUID userId = (UUID) authentication.getPrincipal();
        return ResponseEntity.ok(audioService.getAudioUrl(id, userId));
    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadAudio(@RequestBody AudioUploadRequest request, Principal principal) {
        Authentication authentication = (Authentication) principal;
        UUID userId = (UUID) authentication.getPrincipal();
        return ResponseEntity.ok(audioService.uploadAudio(request, userId));
    }

    public ResponseEntity<?> confirmUpload(UUID id, Principal principal) {
        return null;
    }

    public ResponseEntity<?> downloadAudio(UUID id, Principal principal) {
        return null;
    }

    public ResponseEntity<?> deleteAudio(UUID id, Principal principal) {
        return null;
    }
}
