package com.startup.patterns.structural.bridge;

public class PaymentFeature implements Feature {
    private final ExecutionStrategy executionStrategy;

    public PaymentFeature(ExecutionStrategy executionStrategy) {
        this.executionStrategy = executionStrategy;
    }

    @Override
    public void enable() {
        System.out.println("Enabling payment feature");
        executionStrategy.start();
    }

    @Override
    public void execute() {
        System.out.println("Processing payment operation");
        executionStrategy.process();
    }

    @Override
    public void disable() {
        System.out.println("Disabling payment feature");
        executionStrategy.stop();
    }
}
