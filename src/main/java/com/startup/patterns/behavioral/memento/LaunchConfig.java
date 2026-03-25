package com.startup.patterns.behavioral.memento;

public class LaunchConfig {
    private String name;
    private String description;
    private String category;
    private double budget;
    private String visibility;

    public LaunchConfig(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public LaunchConfigMemento save() {
        return new LaunchConfigMemento(name, description, category, budget, visibility);
    }

    public void restore(LaunchConfigMemento memento) {
        this.name = memento.getName();
        this.description = memento.getDescription();
        this.category = memento.getCategory();
        this.budget = memento.getBudget();
        this.visibility = memento.getVisibility();
    }

    public void printState() {
        System.out.println(name + " | " + category + " | $" + budget + " | " + visibility);
    }
}
