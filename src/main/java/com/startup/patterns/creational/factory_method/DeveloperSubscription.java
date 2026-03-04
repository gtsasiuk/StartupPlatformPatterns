package com.startup.patterns.creational.factory_method;

public class DeveloperSubscription implements SubscriptionPlan {
    private final SubscriptionPlanType planType;
    public DeveloperSubscription(SubscriptionPlanType planType) {
        this.planType = planType;
    }

    @Override
    public String showDetails() {
        return "Subscription for developers " + planType.toString();
    }
}
