package com.keeplearning.singleresponsibility;

import java.util.HashSet;
import java.util.Set;

public class Journal {
    private Set<String> entries = new HashSet<String>();

    public void addEntry(String text) {
        entries.add(text);
    }

    public void removeEntry(String text) {
        entries.remove(text);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
