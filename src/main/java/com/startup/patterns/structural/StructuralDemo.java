package com.startup.patterns.structural;

import com.startup.patterns.structural.adapter.EmailAdapter;
import com.startup.patterns.structural.adapter.NotificationManager;
import com.startup.patterns.structural.adapter.TelegramAdapter;
import com.startup.patterns.structural.bridge.ApiExecution;
import com.startup.patterns.structural.bridge.ChatFeature;
import com.startup.patterns.structural.bridge.CloudExecution;
import com.startup.patterns.structural.bridge.PaymentFeature;
import com.startup.patterns.structural.composite.ProjectCreator;
import com.startup.patterns.structural.decorator.PremiumUserDecorator;
import com.startup.patterns.structural.decorator.SimpleUserProfile;
import com.startup.patterns.structural.decorator.VerifiedUserDecorator;
import com.startup.patterns.structural.proxy.RealStartupAccess;
import com.startup.patterns.structural.proxy.StartupAccessProxy;

public class StructuralDemo {
    public static void main(String[] args) {
        System.out.println("----------Adapter begin----------");
        var emailManager = new NotificationManager(new EmailAdapter());
        emailManager.sendNotification("notify your team about changing policy rules");
        var telegramManager = new NotificationManager(new TelegramAdapter());
        telegramManager.sendNotification("notify your team about changing policy rules");
        System.out.println("----------Adapter end----------");
        System.out.println();

        System.out.println("----------Bridge begin----------");
        System.out.println("Startup app received command to activate chat.");
        var chat = new ChatFeature(new CloudExecution());
        chat.enable();
        chat.execute();
        chat.disable();
        System.out.println("Startup app received an user order");
        var payment = new PaymentFeature(new ApiExecution());
        payment.enable();
        payment.execute();
        payment.disable();
        System.out.println("----------Bridge end----------");
        System.out.println();

        System.out.println("----------Composite begin----------");
        var startupProjectCreator = new ProjectCreator();
        startupProjectCreator.buildStartupProject().execute();
        System.out.println();
        System.out.println("----------Composite end----------");
        System.out.println();

        System.out.println("----------Decorator begin----------");
        var simpleUser = new SimpleUserProfile();
        simpleUser.getDescription();
        System.out.println(simpleUser.getRatingDescription() + "Rating: " + simpleUser.getRating());
        var verifiedUser = new VerifiedUserDecorator(simpleUser);
        verifiedUser.getDescription();
        System.out.println(verifiedUser.getRatingDescription() + "Rating: " + verifiedUser.getRating());
        var verifiedPremiumUser = new PremiumUserDecorator(verifiedUser);
        verifiedPremiumUser.getDescription();
        System.out.println(verifiedPremiumUser.getRatingDescription() + "Rating: " + verifiedPremiumUser.getRating());
        System.out.println("----------Decorator end----------");
        System.out.println();

        System.out.println("----------Facade begin----------");
        System.out.println("----------Facade end----------");
        System.out.println();

        System.out.println("----------Flyweight begin----------");
        System.out.println("----------Flyweight end----------");
        System.out.println();

        System.out.println("----------Proxy begin----------");
        var freeUser = new StartupAccessProxy(new RealStartupAccess(), false);
        freeUser.launch("FreeUser");
        var premiumUser = new StartupAccessProxy(new RealStartupAccess(), true);
        premiumUser.launch("PremiumUser");
        System.out.println("----------Proxy end----------");
    }
}
