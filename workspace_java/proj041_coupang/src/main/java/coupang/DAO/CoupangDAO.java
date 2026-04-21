package coupang.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import coupang.DTO.UserDTO;

public class CoupangDAO {

	public int insertUser(UserDTO userDTO) {
		int result = -1;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// JNDI 방식
			// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다.
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			// DB 접속(그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();
			
			// SQL 준비
			String query = "INSERT INTO coupang_user(user_seq, user_id, user_pw, user_name, user_phone)"; // 변수 방식 이게 더 빠름요
			query += " VALUES (seq_user.nextval, ?, ?, ?, ?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, userDTO.getUser_id());
			ps.setString(2, userDTO.getUser_pw());
			ps.setString(3, userDTO.getUser_name());
			ps.setString(4, userDTO.getUser_phone());
			
			// 실행 및 결과 확보
			result = ps.executeUpdate();
			System.out.println("insertUser 결과 : " + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	
	public boolean checkLogin(UserDTO userDTO) {
		UserDTO dto = null;
		boolean result = false;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// JNDI 방식
			// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다.
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			// DB 접속(그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();
			
			// SQL 준비
			String query = "SELECT * FROM coupang_user"; // 변수 방식 이게 더 빠름요
			query += " WHERE user_id=? AND user_pw=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, userDTO.getUser_id());
			ps.setString(2, userDTO.getUser_pw());
			
			// 실행 및 결과 확보
			rs = ps.executeQuery();
			result = rs.next();
			System.out.println("loginCheck 결과 : "+ result);
//			System.out.println("loginCheck 결과 : " + result);
			dto = userDTO;
			System.out.println(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
