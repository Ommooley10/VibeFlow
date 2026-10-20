package com.ommooley.project.vibeflow.services;

import com.ommooley.project.vibeflow.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
