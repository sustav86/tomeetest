package com.sustav.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@InterceptorBind
@Interceptor
public class InterceptorTwo {
    @AroundInvoke
    public Object around(InvocationContext invocationContext) throws Exception {
        System.out.println(invocationContext.getMethod() + " invoke around two");

        return invocationContext.proceed();
    }

}
