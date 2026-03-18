package com.startup.patterns.structural.flyweight;

public class JavaStack implements TechStack {
    @Override
    public void use(String startupName) {
        System.out.println(startupName + " uses Java stack. (instance=" + System.identityHashCode(this) + ")");
    }
}
