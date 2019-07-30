package com.sustav.interceptor;

import javax.interceptor.Interceptors;

@Interceptors({InterceptorOne.class, InterceptorTwo.class})
public class InterceptorService {

    public void doJob() {
        System.out.println("Job");
    }
}
