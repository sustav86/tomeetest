package com.sustav.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.ejb.EjbTimeService;

@WebServlet(value = "/ejbt")
public class EjbTimeServiceServlet extends HttpServlet {

    @EJB
    private EjbTimeService ejbTimeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ejbTimeService.call();
    }
}
