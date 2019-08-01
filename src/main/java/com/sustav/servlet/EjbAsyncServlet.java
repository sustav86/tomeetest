package com.sustav.servlet;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.ejb.AsyncBean;

@WebServlet(value = "/ejbas")
public class EjbAsyncServlet extends HttpServlet {

    @EJB
    private AsyncBean asyncBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        asyncBean.getName();
        Future<String> myName = asyncBean.getMyName();
        try {
            resp.getWriter().write(myName.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
