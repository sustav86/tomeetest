package com.sustav.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.sustav.entity.Customer;

@WebServlet(value = "/cuvacl")
public class CustomClassValidServlet extends HttpServlet {

    @Inject
    private Validator validator;
    @Inject
    private Customer customer;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        customer.setBirthDate(LocalDate.of(2017, 01, 01));
        customer.setDeathDate(LocalDate.of(2016, 01, 01));
        Set<ConstraintViolation<Customer>> birthDate = validator.validate(customer);
        for (ConstraintViolation violation: birthDate) {
            System.out.println(violation.getMessage());
            System.out.println(violation.getInvalidValue());
        }

    }
}
