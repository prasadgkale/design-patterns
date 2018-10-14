package com.keeplearning.builder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder workAs(String position) {
        person.setPosition(position);
        return this;
    }

    protected EmployeeBuilder self() {
        return this;
    }
}
