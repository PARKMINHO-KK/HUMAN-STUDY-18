package todo.service;

import java.util.List;

import todo.DAO.TodoDAO;
import todo.DTO.TodoDTO;

public class TodoService {

	public List getList() {
		// TodoDAO에 있는 selectAll을 호출하고
		// 그 list를 return 해주세요
//		TodoDAO todoDAO = new TodoDAO();
//		List list = todoDAO.selectAll();
		
		TodoDAO todoDAO = new TodoDAO();
		List list = todoDAO.selectAll();
		
		return list;
	}
	
	public TodoDTO getTodo(int todo_id) {
		TodoDAO todoDAO = new TodoDAO();
		TodoDTO todoDTO = todoDAO.selectOne(todo_id);
		return todoDTO;
	}
	
	public int insertTodo(TodoDTO todoDTO) {
		TodoDAO todoDAO = new TodoDAO();
		int result = todoDAO.insertTodo(todoDTO);
		return result;
	}
	
	public int updateTodo(TodoDTO todoDTO) {
		TodoDAO todoDAO = new TodoDAO();
		int result = todoDAO.updateTodo(todoDTO);
		return result;
	}
	
	public int deleteTodo(TodoDTO todoDTO) {
		TodoDAO todoDAO = new TodoDAO();
		int result = todoDAO.deleteTodo(todoDTO);
		return result;
	}
}
