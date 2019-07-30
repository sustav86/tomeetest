package com.sustav.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator()
public class Decor implements Parent {
    @Inject
    @Delegate
    private Parent parent;

    @Override
    public void print() {

    }
}
