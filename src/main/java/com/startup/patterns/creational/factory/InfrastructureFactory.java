package com.startup.patterns.creational.factory;

public class InfrastructureFactory {
    public static Infrastructure createInfrastructure(InfrastructureType infrastructureType) {
        switch (infrastructureType) {
            case WEB_SERVICE -> { return new WebService(); }
            case MOBILE_APP -> { return new MobileApp(); }
            case RESTAPI_SERVER -> { return new RestServer(); }
            case DB -> { return new PostgresDB(); }
            case CLOUD_STORAGE -> { return new CloudStorage(); }
            case AI_MODULE -> { return new AImodule(); }
            default -> throw new IllegalArgumentException("Unknown infrastructure type: ");
        }
    }
}
