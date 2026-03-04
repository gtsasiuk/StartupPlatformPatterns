package com.startup.patterns.creational;

import com.startup.patterns.creational.singleton.EnvProfile;
import com.startup.patterns.creational.singleton.PlatformConfig;

public class CreationalDemo {
    public static void main(String[] args) {
        System.out.println("----------Singleton begin----------");
        PlatformConfig config = PlatformConfig.getInstance(EnvProfile.DEV, "globalKey1", "USD", 100, "1.0.0");
        System.out.println(config.hashCode());
        System.out.println(config.showConfig());
        PlatformConfig config1 = PlatformConfig.getInstance(EnvProfile.TEST, "globalKey1", "USD", 100, "1.0.0");
        System.out.println(config1.hashCode());
        System.out.println("------------Singleton end----------");
    }
}
