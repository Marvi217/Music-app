package com.musicapp.tonify.model.event;

import lombok.Data;

import java.util.UUID;

@Data
public class ModerationEvent {

    private UUID reportedBy;
    private UUID audioId;
}
