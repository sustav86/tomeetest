package com.sustav;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/di")
public class MyServlet extends HttpServlet {

//    @Alternative
    @Inject
    private Person person;

    @Inject
    @PersonAnnotation
    private Person student;

    @Inject
    @WorkerAnnotation
    private Person worker;

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
        resp.getWriter().write(student.sayWho());
        resp.getWriter().write(worker.sayWho());
        resp.getWriter().write(person.sayWho());
    }
}
