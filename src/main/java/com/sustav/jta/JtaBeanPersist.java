package com.sustav.jta;

import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sustav.entity.Student;

@Singleton
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class JtaBeanPersist {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveStudent() {
        entityManager.persist(new Student("Max", 23));

    }
}
