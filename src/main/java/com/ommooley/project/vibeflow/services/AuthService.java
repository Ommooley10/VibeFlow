package com.ommooley.project.vibeflow.services;

import com.ommooley.project.vibeflow.dto.auth.AuthResponse;
import com.ommooley.project.vibeflow.dto.auth.LoginRequest;
import com.ommooley.project.vibeflow.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
