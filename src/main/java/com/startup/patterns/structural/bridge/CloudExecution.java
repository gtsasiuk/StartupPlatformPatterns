package com.startup.patterns.structural.bridge;

public class CloudExecution implements ExecutionStrategy {
    @Override
    public void start() {
        System.out.println("Starting cloud execution environment");
    }

    @Override
    public void process() {
        System.out.println("Processing request in cloud");
    }

    @Override
    public void stop() {
        System.out.println("Stopping cloud execution");
    }
}
