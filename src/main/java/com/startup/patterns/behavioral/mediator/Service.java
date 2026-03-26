package com.startup.patterns.behavioral.mediator;

public abstract class Service {
    protected PlatformMediator mediator;

    public Service(PlatformMediator mediator) {
        this.mediator = mediator;
    }
}
