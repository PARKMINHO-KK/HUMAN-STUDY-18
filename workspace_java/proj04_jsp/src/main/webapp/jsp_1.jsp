<!-- html 주석 -->
<%-- jsp 주석 --%>

<%--
	디렉티브 태그
	"<%@로 시작하는 태그
	1. page		: 페이지 설정 및 import
	2. include	: 다른 jsp 가져오기
	3. taglib	: custom tag library를 사용할 수 있게 해줌
 --%>
<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    import="java.util.List"
    import="java.util.Map"
    %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp_1</title>
<script>
	window.onload = function(){
		console.log("jsp_1.jsp")
	}
</script>
</head>
<body>
	<h1>hello world</h1>
<!-- 	스크립틀릿Scriptlet -->
	<%
		// 여기는 java 땅입니다
		System.out.println("java BABY~~~~");
	%>

<table border=1>
<% for(int i=0; i<5; i++){ %>
	<tr>
		<td>제목</td>
		<td>내용</td>
	</tr>
<% } %>

<%
	for(int i=0; i<5; i++){
		out.write("	<tr>");
	    out.write("		<td>제목2</td>\r\n");
	    out.write("		<td>내용3</td>\r\n");
	    out.write("	</tr>");
	}
%>

</table>

<%
	String name = request.getParameter("name");
	System.out.println("name : "+ name);

	int a = 10;
%>

<!-- 표현식 -->
<%= a %> <br>
<%= name %>

<!-- 선언문 -->
<%!
	String title = "보스";
	String getTitle(){
		return this.title;
	}
%>
<br>
<%= getTitle() %>

<!-- 구구단 2단 출력 -->
<%
	out.write("<br>");
	out.write("구구단 2단 출력<br>");
	for(int i=0; i<9; i++){
		out.write("2 * "+ (i+1)+ " = "+ 2*(i+1)+ "<br>");
	}
%>

<%@ include file="footer.jsp" %>
<script>
	window.onload = function(){
		console.log("footer.jsp")
	}
</script>

</body>
</html>