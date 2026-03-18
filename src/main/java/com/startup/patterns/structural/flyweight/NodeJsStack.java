package com.startup.patterns.structural.flyweight;

public class NodeJsStack implements TechStack {
    @Override
    public void use(String startupName) {
        System.out.println(startupName + " uses Node.js stack. (instance=" + System.identityHashCode(this) + ")");
    }
}