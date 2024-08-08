package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet("/Todo.list")
public class TodoListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/todo/list doGet 실행");
		TodoService todoService = new TodoService();
		List<TodoDTO> todoList = todoService.getList();

		request.setAttribute("list1", todoList); // 브라우져 -> 서버로 요청보내는 모든 정보가 들어있는 것을 request에 담아서

		request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response); // jsp로 이동시키는 것
	}

}
