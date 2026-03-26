package com.startup.patterns.behavioral.mediator.services;

import com.startup.patterns.behavioral.mediator.PlatformMediator;
import com.startup.patterns.behavioral.mediator.Service;

public class AnalyticsService extends Service {

    public AnalyticsService(PlatformMediator mediator) {
        super(mediator);
    }

    public void trackEvent(String event) {
        System.out.println("Analytics: tracking " + event);
    }
}
