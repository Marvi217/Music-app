package com.musicapp.tonify.service;

import com.musicapp.tonify.dto.request.AudioUploadRequest;
import com.musicapp.tonify.dto.response.AudioUrlResponse;

import java.util.UUID;

public class AudioService {

    public AudioUrlResponse getAudioUrl(UUID id, UUID userId) {
        return null;
    }

    public AudioUrlResponse generateUploadUrl(AudioUploadRequest request, UUID userId) {
        return null;
    }

    public void confirmUpload(UUID id, UUID userId) {
    }

    public void deleteAudio(UUID id, UUID userId) {
    }

    private void checkOwnership(UUID audioId, UUID userId) {
    }
}
