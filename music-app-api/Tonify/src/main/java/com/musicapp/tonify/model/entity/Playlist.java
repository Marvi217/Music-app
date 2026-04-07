package com.musicapp.tonify.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Playlist {

    @Id
    private UUID id;
    private UUID ownerId;
    private String name;
    private String shareToken;
}
