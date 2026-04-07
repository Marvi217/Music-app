package com.musicapp.tonify.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AudioUrlResponse {

    private String sasUrl;
    private Long expiresAt;
}
