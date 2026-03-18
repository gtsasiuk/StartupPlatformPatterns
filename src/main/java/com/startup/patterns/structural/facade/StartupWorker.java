package com.startup.patterns.structural.facade;

public abstract class StartupWorker {
    public void start() {
        System.out.println(name() + " started work.");
    }

    public void stop() {
        System.out.println(name() + " finished work.");
    }

    public abstract void work();

    public abstract String name();
}
