package com.musicapp.tonify.dto.request;

import com.musicapp.tonify.model.enums.AudioType;
import com.musicapp.tonify.model.enums.Genre;

public class AudioUploadRequest {

    private String title;
    private AudioType type;
    private Genre genre;
    private String description;
}
