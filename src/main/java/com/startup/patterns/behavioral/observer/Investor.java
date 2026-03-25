package com.startup.patterns.behavioral.observer;

import java.util.List;

public class Investor implements EventObserver {
    private String name;
    private List<String> interests;

    public Investor(String name, List<String> interests) {
        this.name = name;
        this.interests = interests;
    }

    @Override
    public void update(PlatformEvent event) {
        if (filterEvent(event)) {
            receiveNotification(event.getMessage());
        }
    }

    private boolean filterEvent(PlatformEvent event) {
        for (String interest : interests) {
            if (event.getMessage().toLowerCase().contains(interest.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private void receiveNotification(String message) {
        System.out.println(name + " received: " + message);
    }
}
