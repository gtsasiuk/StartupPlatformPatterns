package com.startup.patterns.structural.facade;

import java.util.List;

public class StartupFacade {
    private final List<StartupWorker> workers;

    public StartupFacade() {
        workers = List.of(
                new BackendDeveloper(),
                new FrontendDeveloper(),
                new DevOpsEngineer()
        );
    }

    public void launchStartup() {
        System.out.println("=== Launching startup ===");

        workers.forEach(StartupWorker::start);
        workers.forEach(StartupWorker::work);

        System.out.println("=== Startup is LIVE ===");
    }

    public void shutdownStartup() {
        System.out.println("=== Shutting down startup ===");

        workers.forEach(StartupWorker::stop);
    }
}
