package com.startup.patterns.creational.factory_method;

import java.util.EnumMap;
import java.util.Map;

public class DeveloperSubscriptionCreator implements SubscriptionPlanCreator {
    private static final Map<SubscriptionPlanType, DeveloperSubscription> DEV_SUBS;

    static {
        DEV_SUBS = new EnumMap<>(SubscriptionPlanType.class);
        for (SubscriptionPlanType planType : SubscriptionPlanType.values()) {
            DEV_SUBS.put(planType, new DeveloperSubscription(planType));
        }
    }

    @Override
    public SubscriptionPlan createSubscriptionPlan(SubscriptionPlanType subscriptionPlanType) {
        return DEV_SUBS.get(subscriptionPlanType);
    }

    @Override
    public String toString() {
        return "Developer subscription creator ";
    }
}
