package com.startup.patterns.creational.abstract_factory;

public class EcommerceAnalyticsService implements AnalyticsService {
    @Override
    public String description() {
        return "E-commerce sales performance analytics";
    }
}
