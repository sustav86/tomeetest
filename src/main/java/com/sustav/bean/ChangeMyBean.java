package com.sustav.bean;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

//@ApplicationScoped
//@SessionScoped
//@RequestScoped
//@ConversationScoped
//@Dependent
public class ChangeMyBean implements Serializable {

    @Inject
    private MyBean myBean;

    public void change() {
        myBean.setI(99);
    }

    public MyBean getMyBean() {
        return myBean;
    }
}
