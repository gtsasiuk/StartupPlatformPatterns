package com.startup.patterns.structural.adapter;

public class EmailAdapter implements NotificationService {
    private final EmailService emailService = new EmailService();


    @Override
    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}
