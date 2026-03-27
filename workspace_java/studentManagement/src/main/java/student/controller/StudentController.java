package student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.DTO.StudentDTO;
import student.service.StudentService;

@WebServlet("/student")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/student doGet 실행");
		
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
	
		// DB에서 가져오기(List)
		StudentService studentService = new StudentService();
		List<StudentDTO> list = studentService.getList();
		
		// html로 출력하기
		PrintWriter out = response.getWriter();
		
		
		// 테이블 항목
		out.println("<table border=1>");
		out.println("	<tr>");		
		out.println("		<th>학생번호</th>");		
		out.println("		<th>이름</th>");		
		out.println("		<th>국어</th>");		
		out.println("		<th>영어</th>");		
		out.println("		<th>수학</th>");		
		out.println("		<th>총점수</th>");		
		out.println("		<th>평균점수</th>");		
		out.println("		<th>등급</th>");		
		out.println("	</tr>");	
		
		for(StudentDTO dto : list) {
		// 테이블 data
		out.println("	<tr>");		
		out.println("		<td>"+ dto.getStuNo() +"</td>");		
		out.println("		<td>"+ dto.getStuName() +"</td>");		
		out.println("		<td>"+ dto.getKorScore() +"</td>");		
		out.println("		<td>"+ dto.getEngScore() +"</td>");		
		out.println("		<td>"+ dto.getMathScore() +"</td>");		
		out.println("		<td>"+ dto.getTotalScore() +"</td>");		
		out.println("		<td>"+ dto.getAvrScore() +"</td>");		
		out.println("		<td>"+ dto.getStuGrade() +"</td>");		
		out.println("	</tr>");
		
		System.out.println(dto.getStuNo());
		}
		out.println("</table>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/student doPost 실행");
//		doGet(request, response);
	}

}
