package todo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("/todo/modify doGet 실행");

		// "todo_id" 받아서 출력하기
		// 한글 꺠짐 방지
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");

		String todo_id = request.getParameter("todo_id");
		System.out.println("todo_id : " + todo_id);
		
//		TodoDTO todoDTO = new TodoDTO(); 
		int nTodo_id = Integer.parseInt(todo_id);
		
		// nTodo_id를 service --> DAO 까지 보낼꺼임
		TodoService todoService = new TodoService();
		TodoDTO todoDTO = todoService.getTodo(nTodo_id);
		
		System.out.println(todoDTO);
		
		PrintWriter out = response.getWriter();
//		out.write("<br><a href='/proj03_1_todo/todo'>뒤로가기</a>");
		out.write("<form method='post' action='/proj03_1_todo/todo/update'>");
		out.write("<br>todo_id : " + todoDTO.getTodo_id());
		out.write("<input type='hidden' name='todo_id' value='" + todoDTO.getTodo_id()+"'>");
		out.write("<br>duedate : "+ "<input type='date' name='duedate' value='" + todoDTO.getDuedate()+"'>");
		out.write("<br>done : "+ "<input type='text' name='done' value='"+ todoDTO.getDone()+"'>");
		out.write("<br>content : "+ "<input type='text' name='content' value='"+todoDTO.getContent()+"'>");
		out.write("<br>ctime : "+ todoDTO.getCtime());
		out.write("<hr>");
		out.write("<input type='submit' value='업데이트'>");
		out.write("</form>");

	}

}
