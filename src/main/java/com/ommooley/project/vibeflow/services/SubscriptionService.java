package com.ommooley.project.vibeflow.services;

import com.ommooley.project.vibeflow.dto.subscription.CheckoutRequest;
import com.ommooley.project.vibeflow.dto.subscription.CheckoutResponse;
import com.ommooley.project.vibeflow.dto.subscription.PortalResponse;
import com.ommooley.project.vibeflow.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
