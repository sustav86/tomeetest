package com.sustav.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class InterceptorTwo {
    @AroundInvoke
    public Object around(InvocationContext invocationContext) throws Exception {
        System.out.println(invocationContext.getMethod() + " invoke around");

        return invocationContext.proceed();
    }

}
