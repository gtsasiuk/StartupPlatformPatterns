package com.startup.patterns.behavioral.visitor;

public class MessageQueue implements Resource {
    private String name;
    private int pendingMessages;

    public MessageQueue(String name, int pendingMessages) {
        this.name = name;
        this.pendingMessages = pendingMessages;
    }

    public String getName() {
        return name;
    }

    public int getPendingMessages() {
        return pendingMessages;
    }

    @Override
    public void accept(ResourceVisitor visitor) {
        visitor.visitMessageQueue(this);
    }
}
