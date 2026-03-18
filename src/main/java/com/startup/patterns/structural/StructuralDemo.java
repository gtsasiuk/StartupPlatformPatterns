package com.startup.patterns.structural;

import com.startup.patterns.structural.adapter.EmailAdapter;
import com.startup.patterns.structural.adapter.NotificationManager;
import com.startup.patterns.structural.adapter.TelegramAdapter;

public class StructuralDemo {
    public static void main(String[] args) {
        System.out.println("----------Adapter begin----------");
        var emailManager = new NotificationManager(new EmailAdapter());
        emailManager.sendNotification("notify your team about changing policy rules");
        var telegramManager = new NotificationManager(new TelegramAdapter());
        telegramManager.sendNotification("notify your team about changing policy rules");
        System.out.println("----------Adapter end----------");
        System.out.println("----------Bridge begin----------");
        System.out.println("----------Bridge end----------");
        System.out.println("----------Composite begin----------");
        System.out.println("----------Composite end----------");
        System.out.println("----------Decorator begin----------");
        System.out.println("----------Decorator end----------");
        System.out.println("----------Facade begin----------");
        System.out.println("----------Facade end----------");
        System.out.println("----------Flyweight begin----------");
        System.out.println("----------Flyweight end----------");
        System.out.println("----------Proxy begin----------");
        System.out.println("----------Proxy end----------");
    }
}
