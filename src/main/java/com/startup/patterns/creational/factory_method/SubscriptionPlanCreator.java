package com.startup.patterns.creational.factory_method;

public interface SubscriptionPlanCreator {
    SubscriptionPlan createSubscriptionPlan(SubscriptionPlanType subscriptionPlanType);
}
