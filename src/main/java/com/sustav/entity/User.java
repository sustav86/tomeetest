package com.sustav.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User {
    @NotNull
    @Pattern(regexp = "[A-Z]")
    private String name;
    private int age;
}
