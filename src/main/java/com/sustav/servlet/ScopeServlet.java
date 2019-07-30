package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.bean.ChangeMyBean;
import com.sustav.bean.MyBean;

@WebServlet(value = "/bean")
public class ScopeServlet extends HttpServlet {

    @Inject
    private MyBean myBean;
    @Inject
    private ChangeMyBean changeMyBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        myBean.setI(88);
        changeMyBean.change();
        resp.getWriter().write(myBean.getI() + " ");
        resp.getWriter().write(myBean + " ");
        resp.getWriter().write(changeMyBean.getMyBean() + " ");
    }
}
