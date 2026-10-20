package com.ommooley.project.vibeflow.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}