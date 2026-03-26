package com.startup.patterns.behavioral.chain;

public class Content {
    private String text;
    private boolean hasMedia;
    private boolean hasLinks;

    public Content(String text, boolean hasMedia, boolean hasLinks) {
        this.text = text;
        this.hasMedia = hasMedia;
        this.hasLinks = hasLinks;
    }

    public String getText() {
        return text;
    }

    public boolean hasMedia() {
        return hasMedia;
    }

    public boolean hasLinks() {
        return hasLinks;
    }
}
