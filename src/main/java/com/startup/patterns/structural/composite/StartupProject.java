package com.startup.patterns.structural.composite;

import java.util.List;

public class StartupProject extends ProjectComponent {
    public StartupProject(List<Stage> stages) {
        stages.forEach(this::addComponent);
    }

    @Override
    protected void before() {
        System.out.println(">>> Startup project execution started <<<\n");
    }

    @Override
    protected void after() {
        System.out.println(">>> Startup project completed <<<");
    }
}
