package com.keeplearning.builder;

public class CodeBuilder {
    private StringBuilder _builder = new StringBuilder();

    public CodeBuilder(String name) {
        _builder.append("public class " + name);
        _builder.append("\n{");
    }

    public CodeBuilder addField(String name, String type) {
        _builder.append("\n  public " + type + " " + name + ";");
        return this;
    }

    public String toString() {
        return _builder.toString() + "\n}";
    }
}
