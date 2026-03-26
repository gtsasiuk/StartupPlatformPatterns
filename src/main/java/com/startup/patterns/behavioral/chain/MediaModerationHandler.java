package com.startup.patterns.behavioral.chain;

public class MediaModerationHandler extends ModerationHandler {

    @Override
    protected boolean check(Content content) {
        System.out.println("Checking media...");

        if (content.hasMedia()) {
            System.out.println("Media verified");
        }
        return true;
    }
}