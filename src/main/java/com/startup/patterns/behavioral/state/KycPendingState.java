package com.startup.patterns.behavioral.state;

public class KycPendingState implements VerificationState {
    @Override
    public void next(User user) {
        user.setState(new VerifiedState());
    }

    @Override
    public void handle(User user) {
        System.out.println(user.getName() + ": Documents under review...");
    }
}
