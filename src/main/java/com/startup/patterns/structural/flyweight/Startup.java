package com.startup.patterns.structural.flyweight;

import java.util.List;

public class Startup {
    private final String name;
    private final List<TechStack> techStacks;

    public Startup(String name, List<TechStack> techStacks) {
        this.name = name;
        this.techStacks = techStacks;
    }

    public void showTech() {
        techStacks.forEach(stack -> stack.use(name));
    }
}
