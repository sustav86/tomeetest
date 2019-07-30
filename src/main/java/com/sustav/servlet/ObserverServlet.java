package com.sustav.servlet;

import com.sustav.bean.Book;
import com.sustav.event.BookService;
import com.sustav.event.BookSubscriber;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@WebServlet(value = "/obs")
public class ObserverServlet extends HttpServlet {

    @Inject
    private BookService bookService;
    @Inject
    private BookSubscriber bookSubscriber;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        bookService.addBook(new Book("Pelevin"));
        resp.getWriter().write(Arrays.toString(bookSubscriber.getBookList().toArray()));
    }

}
