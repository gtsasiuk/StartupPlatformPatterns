package com.startup.patterns.behavioral.strategy;

public class Startup {
    private String name;
    private double budget;
    private FundingStrategy strategy;

    public Startup(String name) {
        this.name = name;
        this.budget = 0;
    }

    public void setStrategy(FundingStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyFunding() {
        if (strategy == null) {
            System.out.println("No strategy selected");
            return;
        }
        strategy.fund(this);
    }

    public void addBudget(double amount) {
        budget += amount;
    }

    public double getBudget() {
        return budget;
    }

    public String getName() {
        return name;
    }
}
