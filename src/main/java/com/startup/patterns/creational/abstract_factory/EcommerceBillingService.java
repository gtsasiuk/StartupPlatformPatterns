package com.startup.patterns.creational.abstract_factory;

public class EcommerceBillingService implements BillingService {
    @Override
    public String description() {
        return "E-commerce subscription billing model";
    }
}
