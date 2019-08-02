package com.sustav.jta;

import javax.ejb.EJB;

public class JtaBeanFirst {
    @EJB
    private JtaBeanPersist jtaBeanPersist;

    public void saveStudent() {
        jtaBeanPersist.saveStudent();
    }
}
