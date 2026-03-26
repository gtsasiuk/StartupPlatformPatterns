package com.startup.patterns.behavioral;

import com.startup.patterns.behavioral.chain.*;
import com.startup.patterns.behavioral.command.*;
import com.startup.patterns.behavioral.iterator.*;
import com.startup.patterns.behavioral.memento.ConfigHistory;
import com.startup.patterns.behavioral.memento.LaunchConfig;
import com.startup.patterns.behavioral.observer.*;
import com.startup.patterns.behavioral.state.User;
import com.startup.patterns.behavioral.strategy.BootstrappingStrategy;
import com.startup.patterns.behavioral.strategy.CrowdfundingStrategy;
import com.startup.patterns.behavioral.strategy.Startup;
import com.startup.patterns.behavioral.strategy.VentureCapitalStrategy;
import com.startup.patterns.behavioral.template.BetaLaunch;
import com.startup.patterns.behavioral.template.FastLaunch;
import com.startup.patterns.behavioral.template.FullLaunch;
import com.startup.patterns.behavioral.template.LaunchProcess;
import com.startup.patterns.behavioral.visitor.Database;
import com.startup.patterns.behavioral.visitor.MessageQueue;
import com.startup.patterns.behavioral.visitor.ResourceMonitorVisitor;
import com.startup.patterns.behavioral.visitor.ServerNode;

import java.time.LocalDateTime;
import java.util.List;

public class BehavioralDemo {
    public static void main(String[] args) {
        System.out.println("------------Chain of responsibility begin----------");
        Content content = new Content(
                "Amazing AI startup platform",
                true,
                false
        );

        ModerationHandler chain = new TextModerationHandler();
        chain.setNext(new MediaModerationHandler())
                .setNext(new LinkModerationHandler())
                .setNext(new ComplianceHandler());

        chain.handle(content);
        System.out.println("------------Chain of responsibility end----------");
        System.out.println();

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

        System.out.println("------------Memento begin----------");
        LaunchConfig config = new LaunchConfig("AI Startup");
        ConfigHistory history = new ConfigHistory();

        config.setCategory("AI");
        config.setBudget(50000);
        config.setVisibility("PRIVATE");

        history.save(config.save());

        config.setBudget(100000);
        config.setVisibility("PUBLIC");

        System.out.println("Current:");
        config.printState();

        config.restore(history.undo());

        System.out.println("After undo:");
        config.printState();
        System.out.println("------------Memento end----------");
        System.out.println();

        System.out.println("----------Template method start----------");
        LaunchProcess fast = new FastLaunch();
        LaunchProcess full = new FullLaunch();
        LaunchProcess beta = new BetaLaunch();

        System.out.println("=== Fast Launch ===");
        fast.launch();

        System.out.println("\n=== Full Launch ===");
        full.launch();

        System.out.println("\n=== Beta Launch ===");
        beta.launch();
        System.out.println("----------Template method end----------");
        System.out.println();


        System.out.println("------------Visitor begin----------");
        ServerNode s1 = new ServerNode("Server-1", 120, 65.5);
        ServerNode s2 = new ServerNode("Server-2", 80, 30.2);

        Database db = new Database("StartupDB", 1500, 120.7);

        MessageQueue mq = new MessageQueue("EmailQueue", 250);

        ResourceMonitorVisitor monitor = new ResourceMonitorVisitor();

        s1.accept(monitor);
        s2.accept(monitor);
        db.accept(monitor);
        mq.accept(monitor);

        monitor.printSummary();
        System.out.println("------------Visitor end----------");
        System.out.println();
    }
}
