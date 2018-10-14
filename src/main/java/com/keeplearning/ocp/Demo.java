package com.keeplearning.ocp;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Apple", Color.RED, Size.SMALL));
        products.add(new Product("Tree", Color.GREEN, Size.LARGE));
        products.add(new Product("Sky", Color.BLUE, Size.HUGE));
        products.add(new Product("Ocean", Color.BLUE, Size.HUGE));
        products.add(new Product("Park", Color.GREEN, Size.LARGE));

        System.out.println("======= OLD GREN/HUGE ========");

        ProductFilter.filterByColor(products,
                Color.GREEN).forEachOrdered(System.out::println);
        ProductFilter.filterBySize(products,
                Size.HUGE).forEachOrdered(System.out::println);

        System.out.println("======= NEW GREEN/HUGE ========");

        new BetterFilter().filter(products,
                new ColorSpecification(Color.GREEN)).forEach(System.out::println);
        new BetterFilter().filter(products,
                new SizeSpecification(Size.HUGE)).forEach(System.out::println);

        System.out.println("======= NEW BLUE && HUGE ========");

        new BetterFilter().filter(products,
                new AndSpecification<>(
                        new SizeSpecification(Size.HUGE),
                        new ColorSpecification(Color.BLUE))
        ).forEach(System.out::println);
    }
}
