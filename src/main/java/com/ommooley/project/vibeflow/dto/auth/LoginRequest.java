package com.ommooley.project.vibeflow.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
