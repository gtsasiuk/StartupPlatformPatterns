package com.startup.patterns.creational.factory;

public class PostgresDB implements Infrastructure {
    @Override
    public String showInfrastructureDetails() {
        return "It's Postgres DB that's store app's data. It's operate this data together with REST server.";
    }
}
