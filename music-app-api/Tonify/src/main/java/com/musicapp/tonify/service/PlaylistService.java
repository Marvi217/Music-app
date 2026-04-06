package com.musicapp.tonify.service;

import com.musicapp.tonify.dto.request.PlaylistRequest;
import com.musicapp.tonify.dto.response.PlaylistResponse;

import java.util.UUID;

public class PlaylistService {

    public PlaylistResponse createPlaylist(PlaylistRequest request, UUID userId) {
        return null;
    }

    public PlaylistResponse getPlaylist(UUID id, UUID userId) {
        return null;
    }

    public PlaylistResponse updatePlaylist(UUID id, PlaylistRequest request, UUID userId) {
        return null;
    }

    public void deletePlaylist(UUID id, UUID userId) {
    }

    public void addTrack(UUID playlistId, UUID trackId, UUID userId) {
    }

    public void removeTrack(UUID playlistId, UUID trackId, UUID userId) {
    }

    public String sharePlaylist(UUID id, UUID userId) {
        return "";
    }

    private void checkOwnership(UUID playlistId, UUID userId) {
    }
}
