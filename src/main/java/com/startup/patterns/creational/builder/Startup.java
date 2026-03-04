package com.startup.patterns.creational.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Startup {
    private final String name;
    private final String description;
    private final BigDecimal budget;
    private final List<User> teamMembers;
    private final List<User> investors;
    private final Set<TechStackType> techStack;
    private final Set<FeatureType> features;
    private final DevStatus devStatus;
    private final EnvType envType;
    private final LocalDate deadline;

    public Startup(String name, String description, BigDecimal budget,
                   List<User> teamMembers, List<User> investors,
                   Set<TechStackType> techStack, Set<FeatureType> features,
                   DevStatus devStatus, EnvType envType, LocalDate deadline) {
        this.name = name;
        this.description = description;
        this.budget = budget;
        this.teamMembers = teamMembers;
        this.investors = investors;
        this.techStack = techStack;
        this.features = features;
        this.devStatus = devStatus;
        this.envType = envType;
        this.deadline = deadline;
    }

    public Startup(StartupBuilder builder) {
        this(builder.name, builder.description, builder.budget, builder.teamMembers, builder.investors,
                builder.techStack, builder.features, builder.devStatus, builder.envType, builder.deadline);
    }

    public static class StartupBuilder {
        private final String name;
        private final String description;
        private BigDecimal budget;
        private List<User> teamMembers;
        private List<User> investors;
        private Set<TechStackType> techStack;
        private Set<FeatureType> features;
        private DevStatus devStatus;
        private EnvType envType;
        private LocalDate deadline;

        public StartupBuilder(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public StartupBuilder budget(BigDecimal budget) {
            this.budget = budget;
            return this;
        }

        public StartupBuilder teamMembers(List<User> teamMembers) {
            this.teamMembers = teamMembers;
            return this;
        }

        public StartupBuilder investors(List<User> investors) {
            this.investors = investors;
            return this;
        }

        public StartupBuilder techStack(Set<TechStackType> techStack) {
            this.techStack = techStack;
            return this;
        }

        public StartupBuilder features(Set<FeatureType> features) {
            this.features = features;
            return this;
        }

        public StartupBuilder devStatus(DevStatus devStatus) {
            this.devStatus = devStatus;
            return this;
        }

        public StartupBuilder envType(EnvType envType) {
            this.envType = envType;
            return this;
        }

        public StartupBuilder deadline(LocalDate deadline) {
            this.deadline = deadline;
            return this;
        }

        public Startup build() {
            return new Startup(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Startup \n");
        sb.append("name = ").append(name).append(";\n");
        sb.append("description = ").append(description).append(";\n");
        sb.append("budget = ").append(budget).append(";\n");
        sb.append("teamMembers = ").append(teamMembers.toString()).append(";\n");
        sb.append("investors = ").append(investors.toString()).append(";\n");
        sb.append("techStack = ").append(techStack).append(";\n");
        sb.append("features = ").append(features).append(";\n");
        sb.append("devStatus = ").append(devStatus).append(";\n");
        sb.append("envType = ").append(envType).append(";\n");
        sb.append("deadline = ").append(deadline).append(";\n");
        return sb.toString();
    }
}
