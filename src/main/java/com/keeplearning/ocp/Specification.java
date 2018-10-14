package com.keeplearning.ocp;

public interface Specification<T> {
    boolean isSatisfied(T t);
}
