package com.sustav.ejb;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.xml.ws.WebServiceRef;

import com.sustav.bean.ExpressLangBean;

@Singleton
public class EjbSessionContext {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;
    @PersistenceContext
    private EntityManager entityManager;
    @EJB
    private EjbChain ejbChain;
    @Inject
    private ExpressLangBean expressLangBean;
    @Resource
    private SessionContext sessionContext;
    @WebServiceRef
    private EjbWebSession ejbWebSession;
}
