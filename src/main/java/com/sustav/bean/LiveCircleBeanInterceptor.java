package com.sustav.bean;

import javax.enterprise.context.RequestScoped;
import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;

import com.sustav.interceptor.Interceptor;

@RequestScoped
@Interceptors(Interceptor.class)
public class LiveCircleBeanInterceptor {

    public LiveCircleBeanInterceptor() {
        System.out.println(getClass().getName() + " constructor");
    }

    public void job1() {
        System.out.println("Job 1");
    }

    @ExcludeClassInterceptors
    public void job2() {
        System.out.println("Job 2");
    }

}
