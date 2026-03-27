package student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import student.DTO.StudentDTO;

public class StudentDAO {

	// 메소드명 : selectAll
	// 전달인자 : 없음
	// 리턴타입 : List

	public List<StudentDTO> selectAll() {
		List<StudentDTO> list = new ArrayList<StudentDTO>();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// JNDI 방식
			// context.xml에 있는 DB 정보로 커넥션 풀을 가져온다.
			Context ctx;
			ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory;
			dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// DB 접속(그런데 이제 커넥션 풀로)
			conn = dataFactory.getConnection();

			// SQL 준비
			String query = "SELECT stuNo, "
							+ "stuName, "
							+ "korScore, "
							+ "engScore, "
							+ "mathScore, "
							+ "(korScore + engScore + mathScore) AS totalScore, "
							+ "ROUND((korScore + engScore + mathScore) / 3) AS avrScore, "
							+ "CASE "
							+ "WHEN (korScore + engScore + mathScore) / 3 >= 90 THEN 'A' "
							+ "WHEN (korScore + engScore + mathScore) / 3 >= 80 THEN 'B' "
							+ "WHEN (korScore + engScore + mathScore) / 3 >= 70 THEN 'C' "
							+ "ELSE 'D' "
							+ "END AS stuGrade "
							+ "FROM student ORDER BY stuNo";
			ps = conn.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			rs = ps.executeQuery();
			
			// 결과 활용
			while (rs.next()) {
				
				int stuNo = rs.getInt("stuNo");
				String stuName = rs.getString("stuName");
				int korScore = rs.getInt("korScore");
				int engScore = rs.getInt("engScore");
				int mathScore = rs.getInt("mathScore");
				int totalScore = rs.getInt("totalScore");
				int avrScore = rs.getInt("avrScore");
				String stuGrade = rs.getString("stuGrade");
				
				StudentDTO studentDTO = new StudentDTO();
				
				studentDTO.setStuNo(stuNo);
				studentDTO.setStuName(stuName);
				studentDTO.setKorScore(korScore);
				studentDTO.setEngScore(engScore);
				studentDTO.setMathScore(mathScore);
				studentDTO.setTotalScore(totalScore);
				studentDTO.setAvrScore(avrScore);
				studentDTO.setStuGrade(stuGrade);
				
				list.add(studentDTO);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return list;
	}

	public int add() {

		int result = 1;
		return result;
	}

}
