package todo.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/update")
public class TodoUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/todo/update doPost 실행");

		// 한글 깨짐 방지
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		String todo_id = request.getParameter("todo_id");
		int nTodo_id = Integer.parseInt(todo_id);
		System.out.println("todo_id : " + nTodo_id);

		String duedate = request.getParameter("duedate");
		Date nDuedate = Date.valueOf(duedate);
		System.out.println("duedate : " + nDuedate);
		
		String done = request.getParameter("done");
		int nDone = Integer.parseInt(done);
		System.out.println("done : " + nDone);
		
		String content = request.getParameter("content");
		System.out.println("content : " + content);

		// DTO에 담기
		TodoDTO todoDTO = new TodoDTO();		
		todoDTO.setTodo_id(nTodo_id);
		todoDTO.setDuedate(nDuedate);
		todoDTO.setDone(nDone);
		todoDTO.setContent(content);
		
		
		// service로 DTO를 보냄
		TodoService todoService = new TodoService();
		int result = todoService.updateTodo(todoDTO);
		System.out.println("result : "+ result);
		
		////////////////////////////////////////////////
//		request.getRequestDispatcher("/todo").forward(request, response);
		
		response.sendRedirect("/proj03_1_todo/todo/detail?todo_id="+nTodo_id);
	
	}

}
