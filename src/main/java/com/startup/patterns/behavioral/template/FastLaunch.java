package com.startup.patterns.behavioral.template;

public class FastLaunch extends LaunchProcess {
    @Override
    protected void validate() {
        System.out.println("Quick validation only...");
    }

    @Override
    protected void executeLaunch() {
        System.out.println("Launching startup quickly!");
    }
}
