package com.ommooley.project.vibeflow.services;

import com.ommooley.project.vibeflow.dto.subscription.PlanLimitsResponse;
import com.ommooley.project.vibeflow.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
