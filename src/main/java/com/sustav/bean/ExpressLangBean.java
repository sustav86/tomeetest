package com.sustav.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named("expressLangBean")
public class ExpressLangBean {
    private String s = "Expression Language";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
