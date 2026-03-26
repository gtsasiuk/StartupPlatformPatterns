package com.startup.patterns.behavioral.mediator;

public interface PlatformMediator {
    void notify(Service sender, String event);
}
