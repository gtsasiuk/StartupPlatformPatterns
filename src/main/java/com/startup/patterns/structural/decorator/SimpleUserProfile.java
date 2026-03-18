package com.startup.patterns.structural.decorator;

public class SimpleUserProfile implements UserProfile {
    @Override
    public void getDescription() {
        System.out.println("-- User Details --");
        System.out.println("Someone's User Profile");
    }

    @Override
    public String getRatingDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("-- User Rating --\n").append("Someone's rating in system\n");
        return sb.toString();
    }

    @Override
    public int getRating() {
        return 5;
    }
}
