package com.startup.patterns.creational;

import com.startup.patterns.creational.builder.*;
import com.startup.patterns.creational.singleton.EnvProfile;
import com.startup.patterns.creational.singleton.PlatformConfig;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class CreationalDemo {
    public static void main(String[] args) {
        System.out.println("----------Builder begin----------");
        Startup aiProject = new Startup.StartupBuilder("AI Platform", "AI analytics SaaS platform")
                .budget(new BigDecimal("50000"))
                .teamMembers(List.of(
                        new User("Alice", "alice@example.com", "123456", UserRole.DEVELOPER),
                        new User("Bob", "bob@example.com", "654321", UserRole.DEVOPS)
                ))
                .investors(List.of(
                        new User("Charlie", "charlie@example.com", "111222", UserRole.INVESTOR)
                ))
                .techStack(Set.of(TechStackType.JAVA, TechStackType.SPRING, TechStackType.AWS))
                .features(Set.of(FeatureType.AI_MODULE, FeatureType.ANALYTICS, FeatureType.NOTIFICATIONS))
                .devStatus(DevStatus.MVP)
                .envType(EnvType.DEV)
                .deadline(LocalDate.of(2026, 6, 30))
                .build();

        Startup mobileShop = new Startup.StartupBuilder("MobileShop", "Marketplace mobile app")
                .budget(new BigDecimal("75000"))
                .teamMembers(List.of(
                        new User("Dana", "dana@example.com", "222333", UserRole.DEVELOPER),
                        new User("Eve", "eve@example.com", "333444", UserRole.DESIGNER),
                        new User("Frank", "frank@example.com", "444555", UserRole.QA)
                ))
                .investors(List.of(
                        new User("George", "george@example.com", "555666", UserRole.INVESTOR)
                ))
                .techStack(Set.of(TechStackType.JAVA, TechStackType.REACT, TechStackType.DOCKER))
                .features(Set.of(FeatureType.PAYMENTS, FeatureType.CHAT, FeatureType.ANALYTICS))
                .devStatus(DevStatus.IN_DEVELOPMENT)
                .envType(EnvType.TEST)
                .deadline(LocalDate.of(2026, 8, 15))
                .build();

        Startup eduPlatform = new Startup.StartupBuilder("EduPlatform", "Online learning platform")
                .budget(new BigDecimal("60000"))
                .teamMembers(List.of(
                        new User("Hank", "hank@example.com", "666777", UserRole.DEVELOPER),
                        new User("Ivy", "ivy@example.com", "777888", UserRole.TEAM_LEADER)
                ))
                .investors(List.of(
                        new User("Jack", "jack@example.com", "888999", UserRole.INVESTOR)
                ))
                .techStack(Set.of(TechStackType.JAVA, TechStackType.SPRING, TechStackType.MONGODB))
                .features(Set.of(FeatureType.AUTH, FeatureType.REPORTING, FeatureType.CHAT))
                .devStatus(DevStatus.BETA)
                .envType(EnvType.PROD)
                .deadline(LocalDate.of(2026, 12, 1))
                .build();

        System.out.println("Startup 1");
        System.out.println(aiProject.toString());
        System.out.println("Startup 2");
        System.out.println(mobileShop.toString());
        System.out.println("Startup 3");
        System.out.println(eduPlatform);

        System.out.println("------------Builder end----------");

        System.out.println("----------Singleton begin----------");
        PlatformConfig config = PlatformConfig.getInstance(EnvProfile.DEV, "globalKey1", "USD", 100, "1.0.0");
        System.out.println(config.hashCode());
        System.out.println(config.showConfig());
        PlatformConfig config1 = PlatformConfig.getInstance(EnvProfile.TEST, "globalKey1", "USD", 100, "1.0.0");
        System.out.println(config1.hashCode());
        System.out.println("------------Singleton end----------");
    }
}
