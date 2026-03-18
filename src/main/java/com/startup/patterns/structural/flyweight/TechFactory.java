package com.startup.patterns.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class TechFactory {

    private final Map<TechType, TechStack> cache = new EnumMap<>(TechType.class);

    public TechStack getTech(TechType type) {
        return cache.computeIfAbsent(type, t -> {
            return switch (t) {
                case JAVA -> new JavaStack();
                case NODEJS -> new NodeJsStack();
                case PYTHON -> new PythonStack();
            };
        });
    }
}