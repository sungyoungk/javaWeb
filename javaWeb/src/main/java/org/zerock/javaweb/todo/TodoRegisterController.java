package org.zerock.javaweb.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoRegisterController", urlPatterns = "/todo/register")
public class TodoRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoRegisterController doget() is called ... ...");

        req.getRequestDispatcher("/WEB-INF/todo/register.jsp")
                .forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("todoRegisterController doPost() is called ... ...");
     resp.sendRedirect("/todo/list");

    }
}
