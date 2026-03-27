
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- request 영역에 넣을 수 있다 -->
<c:set var="a" value="10"></c:set> 
\${a} : ${a}<br>
<% 
	String name = "minho park";
%>
\${name } : ${name }<br>
<c:set var="name2" value="<%= name %>"></c:set>
\${name } : ${name2 }<br>

scope : page > request > session > application<br>
<c:set var="name3" value="<%= name %>" scope="page"></c:set>
scope 생략하면 page<br>

<c:set var="wish" value="date" scope="page"></c:set>
<c:set var="wish" value="여행" scope="request"></c:set>
<c:set var="wish" value="게임" scope="session"></c:set>
<c:set var="wish" value="잠자기" scope="application"></c:set>

\${wish } : ${wish }<br>

pageScope : ${pageScope.wish }<br>
requestScope : ${requestScope.wish }<br>
sessionScope : ${sessionScope.wish }<br>
applicationScope : ${applicationScope.wish }<br>

<%-- <jsp:forward page="jstl_5_1_scope.jsp"></jsp:forward> --%>

<hr>

<c:if test="true">
	항상 참<br>
</c:if>

<c:set var="b" value="100"></c:set> 
<c:if test="${b > 10}">
	b는 10보다 큽니다<br>
</c:if>

<c:if test="${b eq 100}">
	b는 100입니다<br>
</c:if>

<c:if test="${b ne 100}">
	b는 100이 아닙니다<br>
</c:if>

<c:if test="${not(b eq 100)}">
	b는 100이 아닙니다<br>
</c:if>

<c:choose>
	<c:when test="${b eq 99}">
		b는 99입니다<br>
	</c:when>
	<c:when test="${b eq 101}">
		b는 101입니다<br>
	</c:when>
	<c:otherwise>
		b는 99와 101이 아닙니다<br>
	</c:otherwise>
</c:choose>
<hr>
<%
	List list = new ArrayList();
	for(int i=15; i<20; i++){
		Map map = new HashMap();
		map.put("정신연령", i);
		map.put("실제나이", 10+i);
		
		list.add(map);
	}
%>
<c:set var="list2" value="<%= list %>" scope="page"></c:set>
첫번째 목록의 "실제나이"값 출력 : ${ list2[0].실제나이 }세<br>

<br>
items<br>
<%-- <c:forEach var="m" items="<%= list %>"> --%>
<c:forEach var="m" items="${list2 }">
	정신연령 : ${m.정신연령 }<br>
	실제나이 : ${m.실제나이 }<br>
</c:forEach>
<hr>
begin, end<br>
<c:forEach var="i" begin="0" end="3">
	${i}, ${list2[i].정신연령 }<br>
</c:forEach>
<hr>
step<br>
<c:forEach var="i" begin="0" end="30" step="2">
	${i}, ${list2[i].정신연령 }<br>
</c:forEach>

<hr>
varStatus<br>
<hr>
2~9단 출력. 단, 3단 7단은 출력하지 않음<br>
<hr>
<c:forEach var="i" begin="2" end="9">
	<c:if test="${(i ne 3)and(i ne 7)}">
		<br>${i }단 :
		<c:forEach var="m" begin="1" end="9" varStatus="loop">
			&nbsp;${i} * ${m} = ${m*i}
			<c:if test="${not loop.last }">
			,
			</c:if>
		</c:forEach>
	</c:if>
</c:forEach>
<hr>
c:url 사용 이유<br>
1. context path를 자동으로 추가한다<br>
2. 영어나 숫자 외 문자를 encoding 해줌
3. 쿠키 금지일 때 ";jsessionid=어쩌고"를 자동으로 붙여줌
<%-- <c:url var="url1" value="el_4.jsp"> --%>
<c:url var="url1" value="/el_4.jsp">
</c:url>
<a href="${url1 }" target="_blank">el_4.jsp</a><br>

<c:url var="url2" value="https://search.naver.com/search.naver">
	<c:param name="query" value="한글"></c:param>
</c:url>
<a href="${url2 }" target="_blank">네이버검색</a><br>

<hr>
c:out<br>
param.html : ${param.html }<br> 
c:out : <c:out value="${param.html }"></c:out> : innerText <br>
<!-- 
	< : &lt;
	> : &gt;
	공백 : &nbsp;
	& : &amp;
 -->



</body>
</html>