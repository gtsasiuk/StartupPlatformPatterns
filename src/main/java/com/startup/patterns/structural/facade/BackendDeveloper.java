package com.startup.patterns.structural.facade;

public class BackendDeveloper extends StartupWorker {
    @Override
    public void work() {
        System.out.println(name() + " builds REST API");
    }

    @Override
    public String name() {
        return "Backend Developer";
    }
}
