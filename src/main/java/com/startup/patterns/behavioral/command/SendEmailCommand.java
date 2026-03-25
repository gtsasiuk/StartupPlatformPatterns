package com.startup.patterns.behavioral.command;

public class SendEmailCommand implements Command {
    private PlatformManager manager;
    private String content;
    private String[] recipients;

    public SendEmailCommand(PlatformManager manager, String content, String[] recipients) {
        this.manager = manager;
        this.content = content;
        this.recipients = recipients;
    }

    @Override
    public void execute() {
        manager.sendEmail(content, recipients);
    }

    @Override
    public void undo() {
        System.out.println("Undo sending email: '" + content + "'");
    }
}
