package com.startup.patterns.creational.factory;

public class CloudStorage implements Infrastructure {
    @Override
    public String showInfrastructureDetails() {
        return "It's cloud storage where places all other modules and stores part of app's data.";
    }
}
