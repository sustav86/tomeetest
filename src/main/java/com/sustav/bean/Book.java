package com.sustav.bean;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
