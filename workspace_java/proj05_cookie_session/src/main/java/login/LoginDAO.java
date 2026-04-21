package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.EmpDTO;

public class LoginDAO {
	
	public EmpDTO selectMember(EmpDTO dto) {
		EmpDTO resultDTO = null;
		
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
			String query = "SELECT * FROM emp"; // 변수 방식 이게 더 빠름요
			query += " WHERE ename=? and empno=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, dto.getEname());
			ps.setInt(2, dto.getEmpno());
			
			// 실행 및 결과 확보
			rs = ps.executeQuery();
			
			// 결과 활용
			if(rs.next()) {
				resultDTO = new EmpDTO();
				resultDTO.setJob(rs.getString("job"));
			}
			System.out.println("resultDTO 결과 : " + resultDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resultDTO;
	}

}
