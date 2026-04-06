package com.musicapp.tonify.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Playlist {

    @Id
    private UUID id;
    private UUID ownerId;
    private String name;
    private String shareToken;
}
