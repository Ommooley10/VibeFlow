package com.ommooley.project.vibeflow.dto.project;

import com.ommooley.project.vibeflow.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
