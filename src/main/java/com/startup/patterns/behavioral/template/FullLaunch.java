package com.startup.patterns.behavioral.template;

public class FullLaunch extends LaunchProcess {
    @Override
    protected void validate() {
        System.out.println("Full validation (security, legal, data)...");
    }

    @Override
    protected void executeLaunch() {
        System.out.println("Launching startup with full checks!");
    }
}
