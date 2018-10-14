package com.keeplearning.builder;

public class Person {
    private String name;
    private String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }

    public void setPerson(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
