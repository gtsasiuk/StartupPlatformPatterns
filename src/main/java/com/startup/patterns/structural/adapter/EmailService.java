package com.startup.patterns.structural.adapter;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email to " + message);
    }
}
