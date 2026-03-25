package com.startup.patterns.behavioral.observer;

public enum EventType {
    NEW_STARTUP("new startup"),
    NEW_PITCH("new pitch"),
    FUNDING_SUCCESS("funding success");

    private final String description;

    EventType(String description) {
        this.description = description;
    }
}
