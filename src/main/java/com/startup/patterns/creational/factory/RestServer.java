package com.startup.patterns.creational.factory;

public class RestServer implements Infrastructure {
    @Override
    public String showInfrastructureDetails() {
        return "It's RESTful Server that operate, formating data. It's connect with DB, Cloud Storage, Mobile App and Webservice via JSONs and ORM.";
    }
}
