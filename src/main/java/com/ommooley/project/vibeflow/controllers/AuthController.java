package com.ommooley.project.vibeflow.controllers;

import com.ommooley.project.vibeflow.dto.auth.AuthResponse;
import com.ommooley.project.vibeflow.dto.auth.LoginRequest;
import com.ommooley.project.vibeflow.dto.auth.SignupRequest;
import com.ommooley.project.vibeflow.dto.auth.UserProfileResponse;
import com.ommooley.project.vibeflow.services.AuthService;
import com.ommooley.project.vibeflow.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest request) {
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }

}
