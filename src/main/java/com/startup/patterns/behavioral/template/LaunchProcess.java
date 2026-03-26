package com.startup.patterns.behavioral.template;

public abstract class LaunchProcess {
    protected void validate() {
        System.out.println("Validating startup data...");
    }

    protected void prepare() {
        System.out.println("Preparing platform resources...");
    }

    protected abstract void executeLaunch();

    protected void notifyUsers() {
        System.out.println("Sending notifications...");
    }

    public final void launch() {
        prepare();
        validate();
        executeLaunch();
        notifyUsers();
    }
}
