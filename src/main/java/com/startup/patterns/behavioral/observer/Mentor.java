package com.startup.patterns.behavioral.observer;

public class Mentor implements EventObserver {

    private String name;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(PlatformEvent event) {
        if ("NEW_STARTUP".equals(event.getType())) {
            System.out.println(name + " (mentor) notified: " + event.getMessage());
        }
    }
}
