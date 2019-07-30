package com.sustav.servlet;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.sustav.entity.Person;
import com.sustav.entity.PersonAnnotation;
import com.sustav.entity.WorkerAnnotation;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/di")
public class MyServlet extends HttpServlet {

//    @Alternative
//    @Inject
//    private Person person;

    @Inject
    @PersonAnnotation
    private Person student;

    @Inject
    @WorkerAnnotation
    private Person worker;

    @Inject
    private int i;

    @Inject
    private double d;

//    @Inject
//    public MyServlet(final Student student) {
//        this.student = student;
//    }

//    @Inject
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(student.sayWho() + " " + i + " " + d);
        resp.getWriter().write(worker.sayWho());
//        resp.getWriter().write(person.sayWho());
    }
}
