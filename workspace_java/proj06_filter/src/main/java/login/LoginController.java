package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pw = request.getParameter("pw");
//		String pw = (String)session.getAttribute("pw");
		// 비번이 1234인 경우면 
		if("1234".equals(pw)) {
			HttpSession session = request.getSession();
			session.setAttribute("login", "Y");
			System.out.println("로그인 성공");
			
			response.sendRedirect("main");
		} else {
			response.sendRedirect("login.jsp");
			System.out.println("로그인 실패");
		}
		
		// 그렇지 않은 경우
		// 로그인 페이지로 이동
	
	}

}
