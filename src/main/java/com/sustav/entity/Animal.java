package com.sustav.entity;

import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

public class Animal {
    @NotNull(groups = Group1.class)
    private String s1;
    @NotNull(groups = Group2.class)
    private String s2;
    @NotNull(groups = {Group3.class, Group4.class})
    private String s3;
    @NotNull(groups = Default.class)
    private String s4;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }
}
