package coupang.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coupang.DTO.UserDTO;
import coupang.service.CoupangService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/login doGet 실행");

		// 로그인 jsp 파일로 forward
		request.getRequestDispatcher("/coupangLogin.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/login doPost 실행");

		// 요청의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");

		// 파라메터 받기
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("user_id : "+ user_id);
		System.out.println("user_pw : "+ user_pw);
		
		// DTO에 넣기
		UserDTO userDTO = new UserDTO();
		userDTO.setUser_id(user_id);
		userDTO.setUser_pw(user_pw);
		
		// service 시키기
		CoupangService cs = new CoupangService();
		boolean result = cs.checkLogin(userDTO);

		if(result == true) {
			System.out.println("로그인성공");
			response.sendRedirect("/proj041_coupang/index");
		} else {
			System.out.println("로그인 실패");
			response.sendRedirect("/proj041_coupang/login");
		}
	}

}
