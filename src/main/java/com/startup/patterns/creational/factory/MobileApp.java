package com.startup.patterns.creational.factory;

public class MobileApp implements Infrastructure {
    @Override
    public String showInfrastructureDetails() {
        return "It's mobile app with beautiful and intuitive UI/UX design that's allow user to have access and use webservice wherever they want.";
    }
}
