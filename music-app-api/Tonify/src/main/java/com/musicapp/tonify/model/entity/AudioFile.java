package com.musicapp.tonify.model.entity;

import com.musicapp.tonify.model.enums.AudioStatus;
import com.musicapp.tonify.model.enums.AudioType;
import com.musicapp.tonify.model.enums.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    private String storagePath;

}
