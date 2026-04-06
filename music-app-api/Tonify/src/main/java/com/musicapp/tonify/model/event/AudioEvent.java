package com.musicapp.tonify.model.event;

import java.util.UUID;

public class AudioEvent {

    private UUID userId;
    private UUID trackId;
    private String eventType;
    private Long timestamp;
    private Float percentCompleted;
}

