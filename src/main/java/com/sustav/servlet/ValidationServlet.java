package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Validation;

import com.sustav.entity.User;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/valid")
public class ValidationServlet extends HttpServlet {

    @Inject
    private Validation validation;
    @Inject
    private User user;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setName("Vasya");
        user.setAge(18);
    }

}
