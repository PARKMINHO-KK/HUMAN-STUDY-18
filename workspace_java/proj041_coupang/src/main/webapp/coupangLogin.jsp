<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coupang Login</title>
</head>
<body>

<h1>Coupang Login</h1>
<br><br><br>
<form method="post" action="/login">
아이디 : <input type='text' name='user_id'><br>
비밀번호 : <input type='password' name='user_pw'><br>
<input type='submit' value='로그인'>
</form>


</body>
</html>