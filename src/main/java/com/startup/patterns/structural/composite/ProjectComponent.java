package com.startup.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProjectComponent {
    private final List<ProjectComponent> components = new ArrayList<>();

    public void addComponent(ProjectComponent component) {
        components.add(component);
    }

    public int countComponents() {
        return components.size();
    }

    public void execute() {
        before();
        components.forEach(ProjectComponent::execute);
        after();
    }

    protected void before() {
    }

    protected void after() {
    }
}
