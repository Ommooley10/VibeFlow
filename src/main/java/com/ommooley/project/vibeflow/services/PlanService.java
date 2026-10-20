package com.ommooley.project.vibeflow.services;

import com.ommooley.project.vibeflow.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
