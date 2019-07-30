package com.sustav.interceptor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class Interceptor {
    @AroundConstruct
    public Object aroundConstruct(InvocationContext invocationContext) throws Exception {
        System.out.println(invocationContext.getMethod() + " invoke around");

        return invocationContext.proceed();
    }

    @PostConstruct
    public void postConstruction(InvocationContext invocationContext) throws Exception {
        System.out.println(invocationContext.getMethod() + " post construct");
        invocationContext.proceed();
    }

    @AroundInvoke
    public Object around(InvocationContext invocationContext) throws Exception {
        System.out.println(invocationContext.getMethod() + " invoke around");

        return invocationContext.proceed();
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(getClass().getName() + " destroyed");
    }

}
