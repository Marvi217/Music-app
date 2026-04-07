package com.musicapp.tonify.model.event;

import lombok.Data;

import java.util.UUID;

@Data
public class AudioEvent {

    private UUID userId;
    private UUID trackId;
    private String eventType;
    private Long timestamp;
    private Float percentCompleted;
}

