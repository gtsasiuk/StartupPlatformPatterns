package com.startup.patterns.behavioral.chain;

public abstract class ModerationHandler {
    protected ModerationHandler next;

    public ModerationHandler setNext(ModerationHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Content content) {
        if (check(content)) {
            if (next != null) {
                next.handle(content);
            } else {
                System.out.println("Content approved");
            }
        }
    }

    protected abstract boolean check(Content content);
}
