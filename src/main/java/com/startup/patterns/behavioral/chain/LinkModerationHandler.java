package com.startup.patterns.behavioral.chain;

public class LinkModerationHandler extends ModerationHandler {

    @Override
    protected boolean check(Content content) {
        System.out.println("Checking links...");

        if (content.hasLinks()) {
            System.out.println("Links validated");
        }
        return true;
    }
}
