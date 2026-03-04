package com.startup.patterns.creational.factory_method;

public class FounderSubscription implements SubscriptionPlan {
    private final SubscriptionPlanType planType;

    public FounderSubscription(SubscriptionPlanType planType) {
        this.planType = planType;
    }

    @Override
    public String showDetails() {
        return "Subscription for founders " + planType.toString();
    }
}
