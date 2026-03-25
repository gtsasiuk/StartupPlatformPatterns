package com.startup.patterns.behavioral.strategy;

@FunctionalInterface
public interface FundingStrategy {
    void fund(Startup startup);
}
