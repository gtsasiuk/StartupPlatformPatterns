package com.startup.patterns.behavioral.template;

public class BetaLaunch extends LaunchProcess {
    @Override
    protected void executeLaunch() {
        System.out.println("Launching in beta mode (limited users and features)...");
    }

    @Override
    protected void notifyUsers() {
        System.out.println("Sending beta invitations only...");
    }
}
