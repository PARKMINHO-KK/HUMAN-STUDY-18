<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp 목록</h1>
<%-- 	${list } --%>
	<select id="size">
		<option value=5>5</option>
		<option value=10 selected="selected">10</option>
		<option value=15>15</option>
		<option value=20>20</option>
	</select><br>
	<table border=1>
		<thead>
			<tr>
				<th>사원번호 (empno)</th>
				<th>이름 (ename)</th>
				<th>직책 (job)</th>
				<th>관리자번호 (mgr)</th>
				<th>입사일 (hiredate)</th>
				<th>급여 (sal)</th>
				<th>커미션 (comm)</th>
				<th>부서번호 (deptno)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${map.list }">
				<tr>
					<td>${dto.empno}</td>
		            <td>${dto.ename}</td>
		            <td>${dto.job}</td>
		            <td>${dto.mgr}</td>
		            <td>${dto.hiredate}</td>
		            <td>${dto.sal}</td>
		            <td>${dto.comm}</td>
		            <td>${dto.deptno}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

<%
	Map map = (Map)request.getAttribute("map");
	int total = (int)map.get("totalCount");
	int size = (int)map.get("size");
	
	int totalPage = (int)Math.ceil((double)total / size);
	
	
	int section = 5; // 한번에 보여 줄 페이지들의 수
	int pageNum = (int)map.get("page");
	
	int end_section = (int)Math.ceil((double)pageNum / section) * section;
// 	int start_section = end_section - (section-1);
	int start_section = end_section - section + 1;
	
	if(end_section > totalPage){
		end_section = totalPage;
	}
%>

	<c:if test="<%= start_section == 1 %>">
		[이전]
	</c:if>
	<c:if test="<%= start_section != 1 %>">
		[<a href="list?page=<%= start_section-1 %>">이전</a>]	
	</c:if>
	
	<c:forEach var="i" begin="<%= start_section %>" end="<%= end_section %>">
		[<a href="list?page=${i}">
			<c:if test="${map.page eq i }">
				<strong> ${i} </strong>
			</c:if>
			<c:if test="${map.page ne i }">
				${i}
			</c:if>
		</a>]
		
	</c:forEach>
	
	<c:if test="<%= end_section == totalPage %>">
		[다음]
	</c:if>
	<c:if test="<%= end_section != totalPage %>">
		[<a href="list?page=<%= end_section+1 %>">다음</a>]
	</c:if>
	
	<script>
		// select의 change 이벤트에서
		let size = document.querySelector("#size").value
		let url = "list?page=1&size="+size
		// location.href = url
	</script>
	</body>
</html>


















