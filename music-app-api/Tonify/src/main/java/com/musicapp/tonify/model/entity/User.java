package com.musicapp.tonify.model.entity;

import com.musicapp.tonify.model.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class User {

    @Id
    private UUID id;
    private String email;
    private String passwordHash;
    private String googleId;
    private UserRole role;
    private Boolean profilingConsent;
}

