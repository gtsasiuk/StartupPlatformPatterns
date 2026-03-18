package com.startup.patterns.structural.decorator;

public class VerifiedUserDecorator implements UserProfile {
    private final UserProfile userProfile;

    public VerifiedUserDecorator(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public void getDescription() {
        userProfile.getDescription();
        System.out.println("That has been verified");
    }

    @Override
    public String getRatingDescription() {
        return userProfile.getRatingDescription() + "That boosted via verification profile\n";
    }

    @Override
    public int getRating() {
        return userProfile.getRating() + 5;
    }
}
