package com.sustav.ejb;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.interceptor.AroundTimeout;
import javax.interceptor.InvocationContext;

@Singleton
public class EjbTimeService {

    @Schedule(second = "*", minute = "*", hour = "*")
    public void call() {
        System.out.println("Calling");
    }

    @AroundTimeout
    public Object aroundTime(InvocationContext invocationContext) throws Exception {
        System.out.println("before");
        Object proceed = invocationContext.proceed();
        System.out.println("after");

        return proceed;
    }


}
