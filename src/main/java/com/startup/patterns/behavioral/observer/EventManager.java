package com.startup.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventObserver> observers = new ArrayList<>();

    public void subscribe(EventObserver obs) {
        observers.add(obs);
    }

    public void unsubscribe(EventObserver obs) {
        observers.remove(obs);
    }

    public void notifyObservers(PlatformEvent event) {
        for(var obs : observers) {
            obs.update(event);
        }
    }

    public void addEvent(PlatformEvent event) {
        System.out.println("New event: " + event.getMessage());
        notifyObservers(event);
    }
}
