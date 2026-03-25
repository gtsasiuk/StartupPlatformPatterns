package com.startup.patterns.behavioral.strategy;

public class CrowdfundingStrategy implements FundingStrategy {
    @Override
    public void fund(Startup startup) {
        System.out.println("Running crowdfunding campaign...");
        startup.addBudget(10000);
    }
}
