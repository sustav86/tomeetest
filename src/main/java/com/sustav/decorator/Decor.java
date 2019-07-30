package com.sustav.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public class Decor implements Parent {
    @Inject
    @Delegate
    @Any
    private Parent parent;

    @Override
    public void print() {
        System.out.println("decorator print after");
        parent.print();
        System.out.println("decorator print after");
    }
}
