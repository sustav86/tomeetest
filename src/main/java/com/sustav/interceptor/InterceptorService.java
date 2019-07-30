package com.sustav.interceptor;

//@Interceptors({InterceptorOne.class, InterceptorTwo.class})
@InterceptorBind
public class InterceptorService {

    public void doJob() {
        System.out.println("Job");
    }
}
