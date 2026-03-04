package com.startup.patterns.creational.abstract_factory;

public class AIStartupFactory implements StartupPlatformFactory {

    @Override
    public Dashboard createDashboard() {
        return new AIDashboard();
    }

    @Override
    public BillingService createBillingService() {
        return new AIBillingService();
    }

    @Override
    public AnalyticsService createAnalyticsService() {
        return new AIAnalyticsService();
    }
}