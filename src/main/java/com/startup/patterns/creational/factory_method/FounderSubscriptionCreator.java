package com.startup.patterns.creational.factory_method;

import java.util.EnumMap;
import java.util.Map;

public class FounderSubscriptionCreator implements SubscriptionPlanCreator {
    private static final Map<SubscriptionPlanType, FounderSubscription> FOUNDER_SUBS;

    static {
        FOUNDER_SUBS = new EnumMap<>(SubscriptionPlanType.class);
        for (SubscriptionPlanType planType : SubscriptionPlanType.values()) {
            FOUNDER_SUBS.put(planType, new FounderSubscription(planType));
        }
    }

    @Override
    public SubscriptionPlan createSubscriptionPlan(SubscriptionPlanType subscriptionPlanType) {
        return FOUNDER_SUBS.get(subscriptionPlanType);
    }

    @Override
    public String toString() {
        return "Founder subscription creator ";
    }
}
