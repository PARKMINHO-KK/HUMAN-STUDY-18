package coupang.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coupang.DTO.UserDTO;
import coupang.service.CoupangService;

@WebServlet("/join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("/join doGet 실행");

		// 회원가입 jsp 파일로 forward
		request.getRequestDispatcher("/coupangJoin.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/join doPost 실행");

		// 한글 꺠짐 방지
		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		// join.jsp에서 넘어온 파라메터 변수로 받기
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_name = request.getParameter("user_name");
		String user_phone = request.getParameter("user_phone");
		
		System.out.println(user_id);
		System.out.println(user_pw);
		System.out.println(user_name);
		System.out.println(user_phone);
		
		// 변수 dto에 담기
		UserDTO userDTO = new UserDTO();
		userDTO.setUser_id(user_id);
		userDTO.setUser_pw(user_pw);
		userDTO.setUser_name(user_name);
		userDTO.setUser_phone(user_phone);
		
		// join service를 이용해서 add
		CoupangService cs = new CoupangService();
		int result = cs.insertUser(userDTO);
		System.out.println("result : "+ result);
		
		if(result == 1) {
			response.sendRedirect("/proj041_coupang/login");
		} else {
			response.sendRedirect("/proj041_coupang/join");
		}
	}

}
