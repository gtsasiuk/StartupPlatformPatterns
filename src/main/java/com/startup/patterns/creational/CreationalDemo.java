package com.startup.patterns.creational;

import com.startup.patterns.creational.abstract_factory.AIStartupFactory;
import com.startup.patterns.creational.abstract_factory.StartupPlatform;
import com.startup.patterns.creational.abstract_factory.StartupPlatformFactory;
import com.startup.patterns.creational.abstract_factory.StartupType;
import com.startup.patterns.creational.builder.*;
import com.startup.patterns.creational.factory.Infrastructure;
import com.startup.patterns.creational.factory.InfrastructureFactory;
import com.startup.patterns.creational.factory.InfrastructureType;
import com.startup.patterns.creational.factory_method.*;
import com.startup.patterns.creational.prototype.StartupTemplate;
import com.startup.patterns.creational.singleton.EnvProfile;
import com.startup.patterns.creational.singleton.PlatformConfig;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class CreationalDemo {
    public static void main(String[] args) {
        System.out.println("----------Abstract Factory begin----------");
        StartupPlatformFactory aiStartupFactory = StartupPlatform.FactoryMaker.makeFactory(StartupType.AI);
        StartupPlatform aiStartupPlatform = new StartupPlatform(
                aiStartupFactory.createDashboard(),
                aiStartupFactory.createBillingService(),
                aiStartupFactory.createAnalyticsService()
        );
        System.out.println(aiStartupPlatform.dashboard().description());
        System.out.println(aiStartupPlatform.billingService().description());
        System.out.println(aiStartupPlatform.analyticsService().description());
        StartupPlatformFactory ecommerceStartupFactory = StartupPlatform.FactoryMaker.makeFactory(StartupType.ECOMMERCE);
        StartupPlatform ecommerceStartupPlatform = new StartupPlatform(
                ecommerceStartupFactory.createDashboard(),
                ecommerceStartupFactory.createBillingService(),
                ecommerceStartupFactory.createAnalyticsService()
        );
        System.out.println(ecommerceStartupPlatform.dashboard().description());
        System.out.println(ecommerceStartupPlatform.billingService().description());
        System.out.println(ecommerceStartupPlatform.analyticsService().description());
        System.out.println("------------Abstract Factory end----------");
        System.out.println();

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
        System.out.println();

        System.out.println("------------Factory begin----------");
        System.out.println("Infrastructure Factory begin its work.");
        Infrastructure webService = InfrastructureFactory.createInfrastructure(InfrastructureType.WEB_SERVICE);
        Infrastructure mobileApp = InfrastructureFactory.createInfrastructure(InfrastructureType.MOBILE_APP);
        Infrastructure restServer = InfrastructureFactory.createInfrastructure(InfrastructureType.RESTAPI_SERVER);
        Infrastructure postgresDb = InfrastructureFactory.createInfrastructure(InfrastructureType.DB);
        Infrastructure cloudStorage = InfrastructureFactory.createInfrastructure(InfrastructureType.CLOUD_STORAGE);
        Infrastructure aiModule = InfrastructureFactory.createInfrastructure(InfrastructureType.AI_MODULE);
        System.out.println(webService.showInfrastructureDetails());
        System.out.println(mobileApp.showInfrastructureDetails());
        System.out.println(restServer.showInfrastructureDetails());
        System.out.println(postgresDb.showInfrastructureDetails());
        System.out.println(cloudStorage.showInfrastructureDetails());
        System.out.println(aiModule.showInfrastructureDetails());
        System.out.println("------------Factory end----------");
        System.out.println();

        System.out.println("------------Factory method begin----------");
        SubscriptionPlanCreator creator = new FounderSubscriptionCreator();
        SubscriptionPlan subsPlan = creator.createSubscriptionPlan(SubscriptionPlanType.FREE);
        System.out.println(creator + "has created: " + subsPlan.showDetails());
        subsPlan = creator.createSubscriptionPlan(SubscriptionPlanType.PREMIUM);
        System.out.println(creator + "has created: " + subsPlan.showDetails());
        creator = new DeveloperSubscriptionCreator();
        subsPlan = creator.createSubscriptionPlan(SubscriptionPlanType.FREE);
        System.out.println(creator + "has created: " + subsPlan.showDetails());
        subsPlan = creator.createSubscriptionPlan(SubscriptionPlanType.STANDARD);
        System.out.println(creator + "has created: " + subsPlan.showDetails());
        System.out.println("------------Factory method end----------");
        System.out.println();

        System.out.println("------------Prototype begin------------");
        StartupTemplate saas = new StartupTemplate("SaaS Starter", "SaaS", BigDecimal.valueOf(50000));
        StartupTemplate saasClone = (StartupTemplate) saas.doClone();

        if (saas == saasClone) {
            System.out.println("SaaS Starter is not the same");
        }
        if (saas.equals(saasClone)) {
            System.out.println("SaaS Starter is the same");
        }

        StartupTemplate mobile = new StartupTemplate("MobileApp Pro", "Mobile Market Place", BigDecimal.valueOf(75000));
        StartupTemplate mobileClone = (StartupTemplate) mobile.doClone();

        if (mobile == mobileClone) {
            System.out.println("MobileApp Pro is not the same");
        }
        if (mobile.equals(mobileClone)) {
            System.out.println("MobileApp Pro is the same\n");
        }

        System.out.println(saasClone);
        System.out.println(mobileClone);
        System.out.println("------------Prototype end----------");
        System.out.println();

        System.out.println("----------Singleton begin----------");
        PlatformConfig config = PlatformConfig.getInstance(EnvProfile.DEV, "globalKey1", "USD", 100, "1.0.0");
        System.out.println(config.hashCode());
        System.out.println(config.showConfig());
        PlatformConfig config1 = PlatformConfig.getInstance(EnvProfile.TEST, "globalKey1", "USD", 100, "1.0.0");
        System.out.println(config1.hashCode());
        System.out.println("------------Singleton end----------");
    }
}
