package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.bean.ExpressLangBean;
import com.sustav.entity.Car;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/expr")
public class ExpressLangBeanServlet extends HttpServlet {

    @Inject
    private ExpressLangBean expressLangBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/BeanExample.jsp");
        requestDispatcher.forward(req, resp);
    }
}
