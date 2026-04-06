package com.musicapp.tonify.repository;

import com.musicapp.tonify.model.entity.AudioFile;
import com.musicapp.tonify.model.entity.Playlist;
import com.musicapp.tonify.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PlaylistRepository extends JpaRepository<Playlist, UUID> {

    Optional<Playlist> findByIdAndOwnerId(UUID id, UUID ownerId);

    Optional<Playlist> findByShareToken(String shareToken);
}