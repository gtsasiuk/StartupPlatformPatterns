package com.startup.patterns.behavioral.memento;

public class LaunchConfigMemento {
    private final String name;
    private final String description;
    private final String category;
    private final double budget;
    private final String visibility;

    public LaunchConfigMemento(String name, String description, String category, double budget, String visibility) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.budget = budget;
        this.visibility = visibility;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public double getBudget() { return budget; }
    public String getVisibility() { return visibility; }
}
