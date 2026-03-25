package com.startup.patterns.behavioral.state;

public class VerifiedState implements VerificationState {
    @Override
    public void next(User user) {
        System.out.println("User already verified.");
    }

    @Override
    public void handle(User user) {
        System.out.println(user.getName() + ": You are fully verified! You can invest.");
    }
}
