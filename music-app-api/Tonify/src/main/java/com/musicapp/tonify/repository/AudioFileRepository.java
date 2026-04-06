package com.musicapp.tonify.repository;

import com.musicapp.tonify.model.entity.AudioFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AudioFileRepository extends JpaRepository<AudioFile, UUID> {

    Optional<AudioFile> findByIdAndOwnerId(UUID id, UUID ownerId);

    List<AudioFile> findAllByOwnerId(UUID ownerId);
}
