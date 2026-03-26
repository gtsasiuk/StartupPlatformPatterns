package com.startup.patterns.behavioral.chain;

public class ComplianceHandler extends ModerationHandler {

    @Override
    protected boolean check(Content content) {
        System.out.println("Checking compliance...");

        if (content.getText().length() < 10) {
            System.out.println("Rejected: content too short");
            return false;
        }
        return true;
    }
}
