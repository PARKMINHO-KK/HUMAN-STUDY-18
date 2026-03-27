<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="forward.EmpDTO"%>
<%@ page import="forward.EmpService"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//요청의 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		// 응답의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
	
		// DB에서 가져오기(List)
		EmpService empService = new EmpService();
		List<EmpDTO> list = empService.getList();
		
		
%>

	<table border=1>
		<tr>
			<th>EMPNO</th>
			<th>ENAME</th>
			<th>JOB</th>
			<th>MGR</th>
			<th>HIREDATE</th>
			<th>SAL</th>
			<th>COMM</th>
			<th>DEPTNO</th>
		</tr>
		<% for(EmpDTO dto : list){
			out.println("<tr>");
			out.println("<td>"+ dto.getEmpno() +"</td>");				
			out.println("<td>"+ dto.getEname() +"</td>");				
			out.println("<td>"+ dto.getJob() +"</td>");				
			out.println("<td>"+ dto.getMgr() +"</td>");				
			out.println("<td>"+ dto.getHiredate() +"</td>");				
			out.println("<td>"+ dto.getSal() +"</td>");				
			out.println("<td>"+ dto.getComm() +"</td>");				
			out.println("<td>"+ dto.getDeptno() +"</td>");				
			out.println("</tr>");
		} %>
	</table>

</body>
</html>