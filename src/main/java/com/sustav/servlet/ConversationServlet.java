package com.sustav.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sustav.bean.ChangeMyBean;
import com.sustav.bean.ConversationBean;
import com.sustav.bean.MyBean;

@WebServlet(value = "/conv")
public class ConversationServlet extends HttpServlet {

    @Inject
    private ConversationBean conversationBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        conversationBean.setI(1);
        resp.getWriter().write(conversationBean.getI() + " ");
        conversationBean.startConversation();
        resp.getWriter().write(conversationBean.getI() + " ");
        conversationBean.setI(3);
        conversationBean.endConversation();
        resp.getWriter().write(conversationBean.getI() + " ");
    }
}
