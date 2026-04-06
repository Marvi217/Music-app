package com.musicapp.tonify.model.entity;

import com.musicapp.tonify.model.enums.AudioStatus;
import com.musicapp.tonify.model.enums.AudioType;
import com.musicapp.tonify.model.enums.Genre;
import com.musicapp.tonify.model.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class User {

    @Id
    private UUID id;
    private String email;
    private String passwordHash;
    private String googleId;
    private UserRole role;
    private Boolean profilingConsent;
}

