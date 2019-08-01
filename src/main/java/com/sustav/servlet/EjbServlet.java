package com.sustav.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.ejb.EjbHello;
import com.sustav.ejb.EjbLocal;
import com.sustav.ejb.EjbSingl;
import com.sustav.ejb.LocalDeanInteface;

@WebServlet(value = "/ejb")
public class EjbServlet extends HttpServlet {

    @EJB
    private EjbHello ejbHello;
    @EJB
    private EjbHello ejbHello2;
    @EJB
    private EjbSingl ejbSingl;
    @EJB
    private EjbSingl ejbSingl2;
    @EJB
    private EjbLocal ejbLocal;
    @EJB
    private LocalDeanInteface localDeanInteface;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(ejbLocal.getSurname() + " " + ejbLocal.getName());

    }
}
