package com.keeplearning.singleresponsibility;

public class Demo {
    public static void main(String[] args) {
        Journal j = new Journal();
        j.addEntry("I need to do study today!");
        j.addEntry("I need to do jym today!");
        System.out.println(j);

        Persist p = new Persist("journal.txt");
        p.persist(j);
        p.read();
    }
}
