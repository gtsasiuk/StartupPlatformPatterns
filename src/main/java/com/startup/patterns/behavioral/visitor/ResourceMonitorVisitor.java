package com.startup.patterns.behavioral.visitor;

public class ResourceMonitorVisitor implements ResourceVisitor {
    private int totalActiveConnections = 0;
    private double totalCpuLoad = 0.0;
    private int totalRecords = 0;
    private double totalStorage = 0.0;
    private int totalPendingMessages = 0;

    @Override
    public void visitServerNode(ServerNode server) {
        System.out.println("Monitoring server: " + server.getName());
        totalActiveConnections += server.getActiveConnections();
        totalCpuLoad += server.getCpuLoad();
    }

    @Override
    public void visitDatabase(Database db) {
        System.out.println("Monitoring database: " + db.getName());
        totalRecords += db.getTotalRecords();
        totalStorage += db.getStorageUsed();
    }

    @Override
    public void visitMessageQueue(MessageQueue mq) {
        System.out.println("Monitoring message queue: " + mq.getName());
        totalPendingMessages += mq.getPendingMessages();
    }

    public void printSummary() {
        System.out.println("\n--- Platform Resource Summary ---");
        System.out.println("Total active server connections: " + totalActiveConnections);
        System.out.println("Total CPU load across servers: " + totalCpuLoad + "%");
        System.out.println("Total DB records: " + totalRecords);
        System.out.println("Total DB storage used: " + totalStorage + " GB");
        System.out.println("Total pending messages: " + totalPendingMessages);
    }
}
