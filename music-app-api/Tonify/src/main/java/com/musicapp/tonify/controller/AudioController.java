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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class AudioController {

    private final RedisTemplate<String, Object> redisTemplate;
    private final AudioService audioService;


    @GetMapping
    public ResponseEntity<?> getAudioUrl(@RequestParam UUID id, Principal principal) {
        String value = (String) redisTemplate.opsForValue().get(id.toString());
        Authentication auth = (Authentication) principal;
        User user = (User) auth.getPrincipal();

        if(value != null){return ResponseEntity.ok(value);}
        else if (user != null) {
            AudioUrlResponse url = audioService.getAudioUrl(id, user.getId());
            return ResponseEntity.ok(url);
        }
        else {return ResponseEntity.notFound().build();}
    }

    public ResponseEntity<?> uploadAudio(AudioUploadRequest request, Principal principal) {
        return null;
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
