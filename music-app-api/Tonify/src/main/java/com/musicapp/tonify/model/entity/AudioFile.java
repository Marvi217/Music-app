package com.musicapp.tonify.model.entity;

import com.musicapp.tonify.model.enums.AudioStatus;
import com.musicapp.tonify.model.enums.AudioType;
import com.musicapp.tonify.model.enums.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class AudioFile {

    @Id
    private UUID id;
    private UUID ownerId;
    private String title;
    private AudioType type;
    private AudioStatus status;
    private Genre genre;
    private Float energyScore;
    private Float valenceScore;
    private Integer bpm;
}
