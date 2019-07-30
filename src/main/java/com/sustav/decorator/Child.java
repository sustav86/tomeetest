package com.sustav.decorator;

public class Child implements Parent {
    @Override
    public void print() {
        System.out.println(getClass().getName() + " print");
    }
}
