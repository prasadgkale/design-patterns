package com.keeplearning.lsp;

public class Demo {
    public static void main(String[] args) {
        Rectangle square = new Square();
        square.setHeight(10);
        square.setWidth(20);
        System.out.println(square.getWidth() * square.getHeight());
    }
}
