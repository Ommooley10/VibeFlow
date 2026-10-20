package com.ommooley.project.vibeflow.dto.member;

import com.ommooley.project.vibeflow.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
