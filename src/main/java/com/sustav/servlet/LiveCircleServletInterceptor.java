package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.bean.LiveCircleBeanInterceptor;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/inter")
public class LiveCircleServletInterceptor extends HttpServlet {

    @Inject
    private LiveCircleBeanInterceptor circleBeanInterceptor;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        circleBeanInterceptor.job1();
        circleBeanInterceptor.job2();
    }

}
