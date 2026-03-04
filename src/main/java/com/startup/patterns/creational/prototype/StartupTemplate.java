package com.startup.patterns.creational.prototype;

import java.math.BigDecimal;
import java.util.Objects;

public class StartupTemplate implements StartupPrototype {
    private final String name;
    private final BigDecimal budget;
    private final String type;

    public StartupTemplate(String name, String type, BigDecimal budget) {
        this.name = name;
        this.type = type;
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StartupTemplate that = (StartupTemplate) o;
        return Objects.equals(name, that.name) && Objects.equals(budget, that.budget) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StartupTemplate \n");
        sb.append("  name=").append(name).append("\n");
        sb.append("  budget=").append(budget).append("\n");
        sb.append("  type=").append(type).append("\n");
        return sb.toString();
    }

    @Override
    public StartupPrototype doClone() {
        return new StartupTemplate(name, type, budget);
    }
}
