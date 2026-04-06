package com.musicapp.tonify.controller;

import com.musicapp.tonify.dto.request.AudioUploadRequest;
import org.springframework.http.ResponseEntity;

import java.security.Principal;
import java.util.UUID;

public class AudioController {

    public ResponseEntity<?> getAudioUrl(UUID id, Principal principal) {
        return null;
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
