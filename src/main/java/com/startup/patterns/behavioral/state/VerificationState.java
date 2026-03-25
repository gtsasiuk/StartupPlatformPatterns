package com.startup.patterns.behavioral.state;

public interface VerificationState {
    void next(User user);
    void handle(User user);
}
