package com.musicapp.tonify.controller;

import com.musicapp.tonify.dto.request.PlaylistRequest;
import org.springframework.http.ResponseEntity;

import java.security.Principal;
import java.util.UUID;

public class PlaylistController {

    public ResponseEntity<?> createPlaylist(PlaylistRequest request, Principal principal) {
        return null;
    }

    public ResponseEntity<?> getPlaylist(UUID id, Principal principal) {
        return null;
    }

    public ResponseEntity<?> updatePlaylist(UUID id, PlaylistRequest request, Principal principal) {
        return null;
    }

    public ResponseEntity<?> deletePlaylist(UUID id, Principal principal) {
        return null;
    }

    public ResponseEntity<?> addTrack(UUID playlistId, UUID trackId, Principal principal) {
        return null;
    }

    public ResponseEntity<?> removeTrack(UUID playlistId, UUID trackId, Principal principal) {
        return null;
    }

    public ResponseEntity<?> sharePlaylist(UUID id, Principal principal) {
        return null;
    }
}
