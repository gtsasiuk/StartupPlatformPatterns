package com.startup.patterns.structural.adapter;

public class TelegramAdapter implements NotificationService {
    private final TelegramAPI telegramAPI = new TelegramAPI();


    @Override
    public void sendNotification(String message) {
        telegramAPI.sendTelegram(message);
    }
}
