package student.service;

import java.util.List;

import student.DAO.StudentDAO;
import student.DTO.StudentDTO;

public class StudentService {

	public List<StudentDTO> getList() {
		// TodoDAO에 있는 selectAll을 호출하고
		// 그 list를 return 해주세요
		StudentDAO studentDAO = new StudentDAO();
		List<StudentDTO> list = studentDAO.selectAll();

		return list;
	}

}
