package com.startup.patterns.structural.decorator;

public class PremiumUserDecorator implements UserProfile {
    private final UserProfile userProfile;

    public PremiumUserDecorator(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public void getDescription() {
        userProfile.getDescription();
        System.out.println("Has a Premium subscribe");
    }

    @Override
    public String getRatingDescription() {
        return userProfile.getRatingDescription() + "That has a Premium subscribe\n";
    }

    @Override
    public int getRating() {
        return userProfile.getRating() + 15;
    }
}
