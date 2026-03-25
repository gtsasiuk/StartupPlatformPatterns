package com.startup.patterns.behavioral;

import com.startup.patterns.behavioral.iterator.*;
import com.startup.patterns.behavioral.observer.*;

import java.time.LocalDateTime;
import java.util.List;

public class BehavioralDemo {
    public static void main(String[] args) {
        System.out.println("------------Observer begin----------");
        EventManager manager = new EventManager();

        Investor investor1 = new Investor("John", List.of("AI", "FinTech"));
        Mentor mentor1 = new Mentor("Alice");

        manager.subscribe(investor1);
        manager.subscribe(mentor1);

        manager.addEvent(new PlatformEvent(
                EventType.NEW_PITCH,
                "New AI startup is looking for funding",
                LocalDateTime.of(2026, 1, 2, 20, 12, 10)));
        manager.addEvent(new PlatformEvent(EventType.NEW_STARTUP,
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
    }
}
