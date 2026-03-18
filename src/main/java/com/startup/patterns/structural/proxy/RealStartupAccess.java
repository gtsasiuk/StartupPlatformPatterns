package com.startup.patterns.structural.proxy;

public class RealStartupAccess implements StartupAccess {
    @Override
    public void launch(String user) {
        System.out.println(user + " successfully launched a startup!");
    }
}
