package com.keeplearning.ocp;

public class SizeSpecification implements Specification<Product>{
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return this.size == product.getSize();
    }
}
