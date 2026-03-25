package com.startup.patterns.behavioral.command;

public class PlatformManager {
    public void launchCampaign(String campaignName) {
        System.out.println("Launching campaign: " + campaignName);
    }

    public void sendEmail(String content, String[] recipients) {
        System.out.println("Sending email: '" + content + "' to " + recipients.length + " recipients");
    }

    public void archiveStartup(String startupName) {
        System.out.println("Archiving startup: " + startupName);
    }
}
