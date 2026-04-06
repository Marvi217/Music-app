package com.musicapp.tonify.consumer;

import com.musicapp.tonify.model.event.UploadEvent;

import java.util.UUID;

public class UploadProcessingConsumer {

    public void consume(UploadEvent event) {
    }

    private boolean validateMagicBytes(String blobPath) {
        return false;
    }

    private void callAudioAnalyzer(UUID audioId, String blobPath) {
    }
}
