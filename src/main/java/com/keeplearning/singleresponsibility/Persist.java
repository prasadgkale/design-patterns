package com.keeplearning.singleresponsibility;

import java.io.PrintWriter;

public class Persist {
    private String fileName;

    public Persist(String fileName) {
        this.fileName = fileName;
    }

    public void persist(Journal journal) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(journal);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void read() {
        try {
            Runtime.getRuntime().exec("open -a TextEdit " + fileName);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
