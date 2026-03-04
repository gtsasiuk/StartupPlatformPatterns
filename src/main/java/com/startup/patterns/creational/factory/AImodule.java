package com.startup.patterns.creational.factory;

public class AImodule implements Infrastructure {
    @Override
    public String showInfrastructureDetails() {
        return "It's AI module that connect with LLM and integrated in app to provide users modern and innovational features.";
    }
}
