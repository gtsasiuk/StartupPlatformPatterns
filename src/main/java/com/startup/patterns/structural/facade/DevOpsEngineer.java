package com.startup.patterns.structural.facade;

public class DevOpsEngineer extends StartupWorker {
    @Override
    public void work() {
        System.out.println(name() + " deploys application to cloud.");
    }

    @Override
    public String name() {
        return "DevOps Engineer";
    }
}
