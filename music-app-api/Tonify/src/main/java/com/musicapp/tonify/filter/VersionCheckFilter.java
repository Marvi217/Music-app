package com.musicapp.tonify.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

public class VersionCheckFilter extends OncePerRequestFilter {

    private static final String MIN_VERSION = "1.0.0";
    private static final String VERSION_HEADER = "X-AppVersion";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) {
    }

    private boolean isVersionSupported(String version) {
        return false;
    }

    private void rejectRequest(HttpServletResponse response) {
    }
}
