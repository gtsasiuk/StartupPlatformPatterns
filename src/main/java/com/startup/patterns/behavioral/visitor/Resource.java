package com.startup.patterns.behavioral.visitor;

public interface Resource {
    void accept(ResourceVisitor visitor);
}
