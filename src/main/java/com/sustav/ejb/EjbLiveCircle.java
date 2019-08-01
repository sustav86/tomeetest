package com.sustav.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Singleton;

@Singleton
public class EjbLiveCircle {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Destroyed");
    }

    @PrePassivate
    public void prePassivate() {
        System.out.println("prePassivate");
    }

    @PostActivate
    public void postActivate() {
        System.out.println("postActivate");
    }

    @Remove
    public void remove() {
        System.out.println("Remove");
    }

    public void call() {
        System.out.println("Calling");
    }


}
