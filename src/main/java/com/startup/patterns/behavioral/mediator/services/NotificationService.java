package com.startup.patterns.behavioral.mediator.services;

import com.startup.patterns.behavioral.mediator.PlatformMediator;
import com.startup.patterns.behavioral.mediator.Service;

public class NotificationService extends Service {

    public NotificationService(PlatformMediator mediator) {
        super(mediator);
    }

    public void sendNotification(String message) {
        System.out.println("Notification: " + message);
    }
}
