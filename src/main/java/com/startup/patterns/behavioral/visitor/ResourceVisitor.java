package com.startup.patterns.behavioral.visitor;

public interface ResourceVisitor {
    void visitServerNode(ServerNode server);
    void visitDatabase(Database db);
    void visitMessageQueue(MessageQueue mq);
}
