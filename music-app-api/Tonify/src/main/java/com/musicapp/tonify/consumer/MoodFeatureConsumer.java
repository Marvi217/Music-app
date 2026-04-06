package com.musicapp.tonify.consumer;

import com.musicapp.tonify.model.event.AudioEvent;
import com.musicapp.tonify.model.event.UploadEvent;

import java.util.UUID;

public class MoodFeatureConsumer {

    public void consume(AudioEvent event) {
    }

    private void callMoodUpdate(UUID userId, AudioEvent event) {
    }
}