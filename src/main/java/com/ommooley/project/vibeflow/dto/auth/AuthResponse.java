package com.ommooley.project.vibeflow.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
