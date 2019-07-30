package com.sustav.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LiveCircleBean {

    public LiveCircleBean() {
        System.out.println(getClass().getName() + " constructor");
    }

    public void job1() {
        System.out.println("Job 1");
    }

    public void job2() {
        System.out.println("Job 2");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getClass().getName() + " post construct");
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
