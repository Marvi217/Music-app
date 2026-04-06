package com.musicapp.tonify.consumer;

import com.musicapp.tonify.model.event.AudioEvent;

public class PredictionConsumer {

    public void consume(AudioEvent event) {
    }

    private float calculateWeight(AudioEvent event) {
        return 0;
    }
}
