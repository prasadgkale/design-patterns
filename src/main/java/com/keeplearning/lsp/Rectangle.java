package com.keeplearning.lsp;

public class Rectangle {
    protected int height;
    protected int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

