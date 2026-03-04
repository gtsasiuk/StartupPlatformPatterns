package com.startup.patterns.creational.abstract_factory;

public class AIAnalyticsService implements AnalyticsService {
    @Override
    public String description() {
        return "AI model performance analytics";
    }
}
