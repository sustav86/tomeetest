package com.sustav.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@InterceptorBind
@Interceptor
public class InterceptorOne {
    @AroundInvoke
    public Object around(InvocationContext invocationContext) throws Exception {
        System.out.println(invocationContext.getMethod() + " invoke around one  ");

        return invocationContext.proceed();
    }

}
