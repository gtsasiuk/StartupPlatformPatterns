package com.startup.patterns.behavioral.chain;

public class TextModerationHandler extends ModerationHandler {

    @Override
    protected boolean check(Content content) {
        System.out.println("Checking text...");

        if (content.getText().contains("spam")) {
            System.out.println("Rejected: spam detected");
            return false;
        }
        return true;
    }
}
