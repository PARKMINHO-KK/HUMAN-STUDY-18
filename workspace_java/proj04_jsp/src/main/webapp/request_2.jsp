<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="forward.TodoDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello
<!-- 
	forward로 전달 받은 request에서
	num, map을 뽑아서
	syso도, html로도 출력
 -->
 <hr>
 <%
 	int num = (int)request.getAttribute("num");
 	Map map = (Map)request.getAttribute("map");
 	System.out.println("jsp > num : "+ num);
 	System.out.println("jsp > map : "+ map);
 	
 	out.println("jsp > num : "+ num);
 	out.println("<br>jsp > map : "+ map);
 %>
 <br>
 <%= request.getAttribute("num") %><br>
 <%= map %>
 <%
 	List list = (List)request.getAttribute("list");
 	String[] arr = (String[])request.getAttribute("arr");
 	TodoDTO todoDTO = (TodoDTO)request.getAttribute("todoDTO");
 	
 	out.println("<br>list : "+ list);
 	for(int i=0; i<3; i++){
 		out.write("<br>arr"+ i + " : " + arr[i]);
 	}
 	
 	out.println("<br>todoDTO : "+ todoDTO);
 %>
 
 
 
 
</body>
</html>