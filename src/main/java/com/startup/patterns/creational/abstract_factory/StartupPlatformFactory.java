package com.startup.patterns.creational.abstract_factory;

public interface StartupPlatformFactory {
    Dashboard createDashboard();
    BillingService createBillingService();
    AnalyticsService createAnalyticsService();
}
