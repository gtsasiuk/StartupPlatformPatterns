package com.startup.patterns.behavioral.command;

public class LaunchCampaignCommand implements Command {
    private PlatformManager manager;
    private String campaignName;

    public LaunchCampaignCommand(PlatformManager manager, String campaignName) {
        this.manager = manager;
        this.campaignName = campaignName;
    }

    @Override
    public void execute() {
        manager.launchCampaign(campaignName);
    }

    @Override
    public void undo() {
        System.out.println("Undo launching campaign: " + campaignName);
    }
}
