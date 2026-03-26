package com.startup.patterns.behavioral.mediator.services;

import com.startup.patterns.behavioral.mediator.PlatformMediator;
import com.startup.patterns.behavioral.mediator.Service;

public class StorageService extends Service {
    public StorageService(PlatformMediator mediator) {
        super(mediator);
    }

    public void saveData() {
        System.out.println("Saving data...");
        mediator.notify(this, "DATA_SAVED");
    }
}
