package com.startup.patterns.behavioral.mediator.services;

import com.startup.patterns.behavioral.mediator.PlatformMediator;
import com.startup.patterns.behavioral.mediator.Service;

public class BillingService extends Service {
    public BillingService(PlatformMediator mediator) {
        super(mediator);
    }

    public void processPayment() {
        System.out.println("Processing payment...");
        mediator.notify(this, "PAYMENT_DONE");
    }
}
