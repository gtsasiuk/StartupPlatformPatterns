package com.startup.patterns.structural.proxy;

public class StartupAccessProxy implements StartupAccess {
    private final StartupAccess realAccess;
    private final boolean isPremium;

    public StartupAccessProxy(StartupAccess realAccess, boolean isPremium) {
        this.realAccess = realAccess;
        this.isPremium = isPremium;
    }

    @Override
    public void launch(String user) {
        if (isPremium) {
            realAccess.launch(user);
        } else {
            System.out.println(user + " cannot launch startup. Upgrade to Premium!");
        }
    }
}
