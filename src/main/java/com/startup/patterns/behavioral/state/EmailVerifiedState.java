package com.startup.patterns.behavioral.state;

public class EmailVerifiedState implements VerificationState {
    @Override
    public void next(User user) {
        user.setState(new KycPendingState());
    }

    @Override
    public void handle(User user) {
        System.out.println(user.getName() + ": Email verified. Upload documents for KYC.");
    }
}
