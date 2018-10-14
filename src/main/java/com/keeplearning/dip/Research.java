package com.keeplearning.dip;

public class Research {
    Relationships relationships;

    public Research(Relationships relationships) {
        this.relationships = relationships;
    }

    public void showResearch() { // high-level module depends on low-level module
        relationships.getRelations().stream().forEach(
                r -> System.out.println(r.getValue0().getName() +
                        " has " + r.getValue1() + " " + r.getValue2().getName()) );
    }
}
