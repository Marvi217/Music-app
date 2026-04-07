package com.musicapp.tonify.model.entity;

import com.musicapp.tonify.model.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "users")
public class User {

    @Id
    private UUID id;
    private String email;
    private String passwordHash;
    private String googleId;
    private UserRole role;
    private Boolean profilingConsent;
}

