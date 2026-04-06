package com.musicapp.tonify.model.event;

import java.util.UUID;

public class UploadEvent {

    private UUID userId;
    private UUID audioId;
    private String blobPath;
}
