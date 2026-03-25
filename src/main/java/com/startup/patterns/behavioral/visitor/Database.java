package com.startup.patterns.behavioral.visitor;

public class Database implements Resource {
    private String name;
    private int totalRecords;
    private double storageUsed; // GB

    public Database(String name, int totalRecords, double storageUsed) {
        this.name = name;
        this.totalRecords = totalRecords;
        this.storageUsed = storageUsed;
    }

    public String getName() {
        return name;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public double getStorageUsed() {
        return storageUsed;
    }

    @Override
    public void accept(ResourceVisitor visitor) {
        visitor.visitDatabase(this);
    }
}
