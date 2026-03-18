package com.startup.patterns.structural.flyweight;

public class PythonStack implements TechStack {
    @Override
    public void use(String startupName) {
        System.out.println(startupName + " uses Python stack. (instance=" + System.identityHashCode(this) + ")");
    }
}
