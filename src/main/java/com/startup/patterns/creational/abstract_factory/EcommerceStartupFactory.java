package com.startup.patterns.creational.abstract_factory;

public class EcommerceStartupFactory implements StartupPlatformFactory {

    @Override
    public Dashboard createDashboard() {
        return new EcommerceDashboard();
    }

    @Override
    public BillingService createBillingService() {
        return new EcommerceBillingService();
    }

    @Override
    public AnalyticsService createAnalyticsService() {
        return new EcommerceAnalyticsService();
    }
}
