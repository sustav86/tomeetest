package com.sustav.ejb;

import javax.ejb.Stateless;

@Stateless
//@Stateful
//@Singleton
public class EjbHello {
    public String sayHello() {
        return "Hello EJB";
    }
}
