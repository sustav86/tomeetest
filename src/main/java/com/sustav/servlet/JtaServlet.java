package com.sustav.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.jta.JtaBeanFirst;
import com.sustav.jta.JtaBeanPersist;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/jta")
public class JtaServlet extends HttpServlet {

    @EJB
    private JtaBeanPersist jtaBeanPersist;
    @EJB
    private JtaBeanFirst jtaBeanFirst;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        jtaBeanFirst.saveStudent();
    }

}
