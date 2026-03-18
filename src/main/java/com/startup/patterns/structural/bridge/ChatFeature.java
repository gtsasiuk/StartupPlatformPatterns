package com.startup.patterns.structural.bridge;

public class ChatFeature implements Feature {
    private final ExecutionStrategy executionStrategy;

    public ChatFeature(ExecutionStrategy executionStrategy) {
        this.executionStrategy = executionStrategy;
    }

    @Override
    public void enable() {
        System.out.println("Enabling chat feature");
        executionStrategy.start();
    }

    @Override
    public void execute() {
        System.out.println("Executing chat functionality");
        executionStrategy.process();
    }

    @Override
    public void disable() {
        System.out.println("Disabling chat feature");
        executionStrategy.stop();
    }
}
