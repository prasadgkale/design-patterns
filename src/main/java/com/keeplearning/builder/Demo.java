package com.keeplearning.builder;

public class Demo {
    // Fluent Builder
    public static void main(String[] args) {
        EmployeeBuilder personBuilder = new EmployeeBuilder();
        System.out.println(personBuilder.workAs("Programmmer").withName("John").build());

        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        System.out.println(cb);
    }
}
