package com.startup.patterns.behavioral.state;

public class User {
    private String name;
    private VerificationState state;

    public User(String name) {
        this.name = name;
        this.state = new NewState();
    }

    public String getName() {
        return name;
    }

    public void setState(VerificationState state) {
        this.state = state;
    }

    public void performAction() {
        state.handle(this);
    }

    public void nextStep() {
        state.next(this);
    }
}
