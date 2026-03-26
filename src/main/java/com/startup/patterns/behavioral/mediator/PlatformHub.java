package com.startup.patterns.behavioral.mediator;

import com.startup.patterns.behavioral.mediator.services.AnalyticsService;
import com.startup.patterns.behavioral.mediator.services.BillingService;
import com.startup.patterns.behavioral.mediator.services.NotificationService;
import com.startup.patterns.behavioral.mediator.services.StorageService;

public class PlatformHub implements PlatformMediator {
    private AnalyticsService analyticsService;
    private NotificationService notificationService;
    private BillingService billingService;
    private StorageService storageService;

    public void setAnalyticsService(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setBillingService(BillingService billingService) {
        this.billingService = billingService;
    }

    public void setStorageService(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public void notify(Service sender, String event) {

        if (sender instanceof StorageService && event.equals("DATA_SAVED")) {
            notificationService.sendNotification("Data saved successfully!");
            analyticsService.trackEvent("DATA_SAVED");
        }

        if (sender instanceof BillingService && event.equals("PAYMENT_DONE")) {
            notificationService.sendNotification("Payment completed!");
            analyticsService.trackEvent("PAYMENT");
        }
    }
}
