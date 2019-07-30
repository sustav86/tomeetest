package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.decorator.Parent;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/dec")
public class DecoratorServlet extends HttpServlet {

    @Inject
    private Parent parent;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        parent.print();
    }

}
