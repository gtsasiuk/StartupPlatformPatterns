package com.startup.patterns.structural.composite;

public class Task extends ProjectComponent {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    protected void before() {
        System.out.println("    Task: " + name);
    }
}
