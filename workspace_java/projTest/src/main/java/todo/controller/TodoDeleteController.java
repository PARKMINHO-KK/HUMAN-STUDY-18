package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("/todo/delete doGet 실행");

		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");

		String todo_id = request.getParameter("todo_id");
		System.out.println("todo_id : " + todo_id);

		// TodoDTO todoDTO = new TodoDTO(); 
		int nTodo_id = Integer.parseInt(todo_id);
		
		// DTO에 담기
		TodoDTO todoDTO = new TodoDTO();		
		todoDTO.setTodo_id(nTodo_id);

		// nTodo_id를 service --> DAO 까지 보낼꺼임
		TodoService todoService = new TodoService();
		int result = todoService.deleteTodo(todoDTO);
		
		response.sendRedirect("/proj03_1_todo/todo");

	}

}
