package com.startup.patterns.behavioral.state;

public class NewState implements VerificationState {
    @Override
    public void next(User user) {
        user.setState(new EmailVerifiedState());
    }

    @Override
    public void handle(User user) {
        System.out.println(user.getName() + ": Please verify your email.");
    }
}
