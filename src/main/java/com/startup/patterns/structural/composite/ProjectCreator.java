package com.startup.patterns.structural.composite;

import java.util.List;

public class ProjectCreator {

    public ProjectComponent buildStartupProject() {

        Stage development = new Stage("Development", List.of(
                new Task("Setup backend"),
                new Task("Create REST API"),
                new Task("Implement business logic")
        ));

        Stage testing = new Stage("Testing", List.of(
                new Task("Write unit tests"),
                new Task("Integration testing")
        ));

        Stage deployment = new Stage("Deployment", List.of(
                new Task("Setup CI/CD"),
                new Task("Deploy to cloud")
        ));

        return new StartupProject(List.of(development, testing, deployment));
    }
}