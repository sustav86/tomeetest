package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.ejb.EjbLiveCircle;

@WebServlet(value = "/ejbcir")
public class EjbLiveCircleServlet extends HttpServlet {

    @Inject
    private EjbLiveCircle ejbLiveCircle;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ejbLiveCircle.call();
    }
}
