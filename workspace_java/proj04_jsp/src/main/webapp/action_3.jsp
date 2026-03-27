<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<%-- 	<jsp:include page="jsp_1.jsp?name=abcd"></jsp:include> --%>
	<jsp:include page="jsp_1.jsp">
		<jsp:param name="name" value="abcd" />
	</jsp:include>
<!-- 	include 안에 주석 있으니까 에러나더라 -->
<%-- 		<jsp:param name="name" value="abcd"></jsp:param> --%>

<%-- 	<jsp:forward page="footer.jsp" /> --%>
	
	<%
		forward.EmpDTO dto2 = new forward.EmpDTO();
		pageContext.setAttribute("dto2", dto2);
	%>
	<jsp:useBean id="dto" class="forward.EmpDTO" scope="page"></jsp:useBean>
	
	property에 지정한 글씨를 기반으로 setter 호출<br>
	<jsp:setProperty property="empno" name="dto" value="1234"/>
	<jsp:setProperty property="empno" name="dto" value='<%= Integer.parseInt(request.getParameter("empno")) %>'/>
	<jsp:setProperty property="empno" name="dto" value="${param.empno }"/>
	<jsp:setProperty property="ename" name="dto" value="${param.ename }"/>
	
	전달받은 파라메터 이름을 기반으로 알아서 모든 setter를 호출한다
	<jsp:setProperty property="*" name="dto"/>
	
	<hr>
	${dto }
	<hr>
	<jsp:getProperty property="ename" name="dto"/><br>
	\${dto.ename } : ${dto.ename } <br>
	
</body>
</html>