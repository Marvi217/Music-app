package com.musicapp.tonify.service;

import com.musicapp.tonify.dto.request.AudioUploadRequest;
import com.musicapp.tonify.dto.response.AudioUrlResponse;
import com.musicapp.tonify.model.entity.AudioFile;
import com.musicapp.tonify.model.entity.User;
import com.musicapp.tonify.model.enums.AudioStatus;
import com.musicapp.tonify.repository.AudioFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class AudioService {

    private final RedisTemplate<String, Object> redisTemplate;
    private final SasTokenService sasTokenService;
    private final AudioFileRepository audioFileRepository;

    public AudioUrlResponse getAudioUrl(UUID id, UUID userId) {
        String value = (String) redisTemplate.opsForValue().get(id.toString());

        if(value != null){
            return AudioUrlResponse.builder()
                    .sasUrl(value)
                    .expiresAt(15L)
                    .build();
        }
        else if (userId != null) {
            Optional<AudioFile> file = audioFileRepository.findByIdAndOwnerId(id, userId);
            AudioFile audioFile = file.orElseThrow();
            String url = sasTokenService.generateGetToken(audioFile.getStoragePath(), 360);
            redisTemplate.opsForValue().set(id.toString(), url, 14, TimeUnit.MINUTES);

            return AudioUrlResponse.builder()
                    .sasUrl(url)
                    .expiresAt(4L)
                    .build();
        }
        else {throw new AccessDeniedException("Unauthorized");}
    }

    public AudioUrlResponse uploadAudio(AudioUploadRequest request, UUID userId) {
        UUID audioId = UUID.randomUUID();
        String storagePath = "audio/" + userId + "/" + audioId;

        AudioFile audioFile = AudioFile.builder()
                .id(audioId)
                .ownerId(userId)
                .title(request.getTitle())
                .type(request.getType())
                .genre(request.getGenre())
                .status(AudioStatus.ACTIVE)
                .storagePath(storagePath)
                .build();

        audioFileRepository.save(audioFile);

        String putUrl = sasTokenService.generatePutToken(storagePath, 900);

        return AudioUrlResponse.builder()
                .sasUrl(putUrl)
                .expiresAt(900L)
                .build();
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
