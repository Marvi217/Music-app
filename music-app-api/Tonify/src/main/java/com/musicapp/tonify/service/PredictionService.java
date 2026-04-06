package com.musicapp.tonify.service;

import com.musicapp.tonify.dto.response.MoodVector;
import com.musicapp.tonify.dto.response.PredictionResponse;

import java.util.UUID;

public class PredictionService {

    public PredictionResponse getNextTrack(UUID userId, UUID currentTrackId) {
        return null;
    }

    private PredictionResponse callMlService(UUID userId, UUID trackId, MoodVector mood) {
        return null;
    }

    private UUID getCachedPrediction(UUID userId) {
        return userId;
    }

    private void cachePrediction(UUID userId, UUID nextTrackId) {
    }
}
