package com.startup.patterns.creational.factory_method;

public enum SubscriptionPlanType {
    FREE("free"),
    STANDARD("standard"),
    PREMIUM("premium");

    private final String name;

    SubscriptionPlanType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
