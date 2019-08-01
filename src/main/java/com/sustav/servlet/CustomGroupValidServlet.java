package com.sustav.servlet;

import java.io.IOException;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.sustav.entity.Animal;
import com.sustav.entity.Group1;

@WebServlet(value = "/cuva")
public class CustomGroupValidServlet extends HttpServlet {

    @Inject
    private Validator validator;
    @Inject
    private Animal animal;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Set<ConstraintViolation<Animal>> group = validator.validate(animal, Group1.class);
        for (ConstraintViolation violation: group) {
            System.out.println(violation.getMessage());
            System.out.println(violation.getInvalidValue());
        }

    }
}
