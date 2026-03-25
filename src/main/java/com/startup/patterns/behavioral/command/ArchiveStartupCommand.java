package com.startup.patterns.behavioral.command;

public class ArchiveStartupCommand implements Command {
    private PlatformManager manager;
    private String startupName;

    public ArchiveStartupCommand(PlatformManager manager, String startupName) {
        this.manager = manager;
        this.startupName = startupName;
    }

    @Override
    public void execute() {
        manager.archiveStartup(startupName);
    }

    @Override
    public void undo() {
        System.out.println("Undo archiving startup: " + startupName);
    }
}
