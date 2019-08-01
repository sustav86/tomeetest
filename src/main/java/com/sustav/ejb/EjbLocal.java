package com.sustav.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
//@Local(LocalDeanInteface.class)
//@Remote(LocalDeanInteface.class)
@LocalBean
public class EjbLocal implements LocalDeanInteface {
    @Override
    public String getName() {
        return "ANT";
    }

    public String getSurname() {
        return "ASUR";
    }
}
