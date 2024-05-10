package org.zerock.javaweb.todo;

import java.util.List;
import org.zerock.javaweb.todo.DTO.TodoDTO;
import org.zerock.javaweb.todo.service.TodoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("/todo/list");

        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();
        req.setAttribute("list", dtoList);

        req.getRequestDispatcher("/WEB-INF/todo/list.jsp")
                .forward(req, resp);


    }
}
