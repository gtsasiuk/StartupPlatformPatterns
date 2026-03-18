package com.startup.patterns.structural.bridge;

public class ApiExecution implements ExecutionStrategy {
    @Override
    public void start() {
        System.out.println("Connecting to external API service");
    }

    @Override
    public void process() {
        System.out.println("Processing request via API");
    }

    @Override
    public void stop() {
        System.out.println("Finishing API execution process");
    }
}
