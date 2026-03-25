package com.startup.patterns.behavioral.strategy;

public class VentureCapitalStrategy implements FundingStrategy {
    @Override
    public void fund(Startup startup) {
        System.out.println("Getting venture capital investment...");
        startup.addBudget(100000);
    }
}
