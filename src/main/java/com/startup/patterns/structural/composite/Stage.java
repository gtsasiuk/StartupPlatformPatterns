package com.startup.patterns.structural.composite;

import java.util.List;

public class Stage extends ProjectComponent {
    private final String name;

    public Stage(String name,List<Task> tasks) {
        this.name = name;
        tasks.forEach(this::addComponent);
    }

    @Override
    protected void before() {
        System.out.println("== Starting stage: " + name + " ==");
    }

    @Override
    protected void after() {
        System.out.println("== Finished stage: " + name + " ==\n");
    }
}
