package com.startup.patterns.behavioral.observer;

import java.time.LocalDateTime;

public class PlatformEvent {
    private EventType type;
    private String message;
    private LocalDateTime timestamp;

    public PlatformEvent(EventType type, String message, LocalDateTime timestamp) {
        this.type = type;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type.toString();
    }
}
