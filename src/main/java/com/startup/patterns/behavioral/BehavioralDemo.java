package com.startup.patterns.behavioral;

import com.startup.patterns.behavioral.command.*;
import com.startup.patterns.behavioral.iterator.*;
import com.startup.patterns.behavioral.observer.*;
import com.startup.patterns.behavioral.state.User;
import com.startup.patterns.behavioral.strategy.BootstrappingStrategy;
import com.startup.patterns.behavioral.strategy.CrowdfundingStrategy;
import com.startup.patterns.behavioral.strategy.Startup;
import com.startup.patterns.behavioral.strategy.VentureCapitalStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class BehavioralDemo {
    public static void main(String[] args) {
        System.out.println("------------Command begin----------");
        PlatformManager platformManager = new PlatformManager();
        CommandInvoker invoker = new CommandInvoker();

        Command launchCampaign = new LaunchCampaignCommand(platformManager, "Spring Sale");
        Command sendEmail = new SendEmailCommand(platformManager, "Hello investors!", new String[]{"alice@x.com", "bob@y.com"});
        Command archiveStartup = new ArchiveStartupCommand(platformManager, "OldStartup");

        invoker.executeCommand(launchCampaign);
        invoker.executeCommand(sendEmail);
        invoker.executeCommand(archiveStartup);

        System.out.println("\nUndo last command:");
        invoker.undoLast();

        System.out.println("\nUndo Spring Sale:");
        invoker.undo(launchCampaign);
        System.out.println("------------Command end----------");
        System.out.println();

        System.out.println("------------Observer begin----------");
        EventManager eventManager = new EventManager();

        Investor investor1 = new Investor("John", List.of("AI", "FinTech"));
        Mentor mentor1 = new Mentor("Alice");

        eventManager.subscribe(investor1);
        eventManager.subscribe(mentor1);

        eventManager.addEvent(new PlatformEvent(
                EventType.NEW_PITCH,
                "New AI startup is looking for funding",
                LocalDateTime.of(2026, 1, 2, 20, 12, 10)));
        eventManager.addEvent(new PlatformEvent(EventType.NEW_STARTUP,
                "New Health startup joined platform",
                        LocalDateTime.now().minusDays(1)));
        System.out.println("------------Observer end----------");

        System.out.println();
        System.out.println("------------Iterator begin----------");
        PitchRequestCollection collection = new PitchRequestCollection();

        collection.addRequest(new PitchRequest(1L, "AI Builder", 50000, ProjectCategory.AI, RequestStatus.OPEN));
        collection.addRequest(new PitchRequest(2L, "HealthApp", 30000, ProjectCategory.HEALTH, RequestStatus.REJECTED));
        collection.addRequest(new PitchRequest(3L, "FinTechX", 100000, ProjectCategory.FINTECH, RequestStatus.OPEN));
        collection.addRequest(new PitchRequest(4L, "Ukr Chat AI", 200000, ProjectCategory.AI, RequestStatus.OPEN));
        collection.addRequest(new PitchRequest(5L, "E-commerce web-service", 200000, ProjectCategory.E_COMMERCE, RequestStatus.APPROVED));
        collection.addRequest(new PitchRequest(6L, "SaaS Logistic Helper", 30000, ProjectCategory.SAAS, RequestStatus.OPEN));

        PitchIterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("------------Iterator end----------");
        System.out.println();

        System.out.println("------------Strategy begin----------");
        Startup startup = new Startup("FinTechX");

        startup.setStrategy(new BootstrappingStrategy());
        startup.applyFunding();

        startup.setStrategy(new CrowdfundingStrategy());
        startup.applyFunding();

        startup.setStrategy(new VentureCapitalStrategy());
        startup.applyFunding();

        System.out.println("Total budget: " + startup.getBudget());
        System.out.println("------------Strategy end----------");
        System.out.println();

        System.out.println("------------State begin----------");
        User user = new User("Eugene");

        user.performAction();
        user.nextStep();

        user.performAction();
        user.nextStep();

        user.performAction();
        user.nextStep();

        user.performAction();
        System.out.println("------------State end----------");
        System.out.println();
    }
}
