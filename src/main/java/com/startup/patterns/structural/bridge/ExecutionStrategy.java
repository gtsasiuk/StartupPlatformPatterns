package com.startup.patterns.structural.bridge;

public interface ExecutionStrategy {
    void start();
    void process();
    void stop();
}
