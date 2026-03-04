package com.startup.patterns.creational.abstract_factory;

public record StartupPlatform(
        Dashboard dashboard,
        BillingService billingService,
        AnalyticsService analyticsService
) {
    public static class FactoryMaker {

        public static StartupPlatformFactory makeFactory(StartupType type) {
            return switch (type) {
                case AI -> new AIStartupFactory();
                case ECOMMERCE -> new EcommerceStartupFactory();
            };
        }
    }
}
