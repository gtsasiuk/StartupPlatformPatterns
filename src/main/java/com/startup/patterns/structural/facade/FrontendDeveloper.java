package com.startup.patterns.structural.facade;

public class FrontendDeveloper extends StartupWorker {
    @Override
    public void work() {
        System.out.println(name() + " is designing a website");
    }

    @Override
    public String name() {
        return "Frontend Engineer";
    }
}
