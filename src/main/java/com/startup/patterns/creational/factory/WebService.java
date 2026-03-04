package com.startup.patterns.creational.factory;

public class WebService implements Infrastructure {
    @Override
    public String showInfrastructureDetails() {
        return "It's web browser app with beautiful, adaptable and intuitive UI/UX design with main functionality.";
    }
}
