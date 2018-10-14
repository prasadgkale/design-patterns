package com.keeplearning.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {
    public static Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.getColor() == color);
    }

    public static Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.getSize() == size);
    }
}
