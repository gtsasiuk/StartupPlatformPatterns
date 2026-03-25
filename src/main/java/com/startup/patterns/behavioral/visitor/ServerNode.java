package com.startup.patterns.behavioral.visitor;

public class ServerNode implements Resource {
    private String name;
    private int activeConnections;
    private double cpuLoad;

    public ServerNode(String name, int activeConnections, double cpuLoad) {
        this.name = name;
        this.activeConnections = activeConnections;
        this.cpuLoad = cpuLoad;
    }

    public String getName() {
        return name;
    }

    public int getActiveConnections() {
        return activeConnections;
    }

    public double getCpuLoad() {
        return cpuLoad;
    }

    @Override
    public void accept(ResourceVisitor visitor) {
        visitor.visitServerNode(this);
    }
}
