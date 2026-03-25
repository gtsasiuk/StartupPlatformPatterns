package com.startup.patterns.behavioral.strategy;

public class BootstrappingStrategy implements FundingStrategy {
    @Override
    public void fund(Startup startup) {
        System.out.println("Using personal funds...");
        startup.addBudget(3000);
    }
}
