package com.sustav.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.ejb.EjbConcurrent;

@WebServlet(value = "/ejbcon")
public class EjbConcurrentServlet extends HttpServlet {

    @EJB
    private EjbConcurrent ejbConcurrent;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write(ejbConcurrent.setI(ejbConcurrent.getI() + 1) + " ");
        resp.getWriter().write(ejbConcurrent.increase() + " ");
    }
}
