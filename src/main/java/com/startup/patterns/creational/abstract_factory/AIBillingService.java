package com.startup.patterns.creational.abstract_factory;

public class AIBillingService implements BillingService {
    @Override
    public String description() {
        return "AI subscription billing model";
    }
}
