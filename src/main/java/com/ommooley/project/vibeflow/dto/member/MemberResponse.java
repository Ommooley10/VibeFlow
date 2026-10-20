package com.ommooley.project.vibeflow.dto.member;

import com.ommooley.project.vibeflow.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}

