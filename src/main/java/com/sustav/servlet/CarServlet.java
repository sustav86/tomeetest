package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.entity.Car;
import com.sustav.entity.Person;
import com.sustav.entity.PersonAnnotation;
import com.sustav.entity.WorkerAnnotation;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/car")
public class CarServlet extends HttpServlet {

    @Inject
    private Car car;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(car.getName());
    }
}
