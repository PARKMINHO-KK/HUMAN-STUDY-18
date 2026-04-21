<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coupang Join</title>
</head>
<body>

<h1>Coupang 회원가입</h1>
<br><br><br>
<form method="post" action="/proj041_coupang/join">
아이디 : <input type='text' name='user_id'><br>
비밀번호 : <input type='password' name='user_pw'><br>
비밀번호확인 : <input type='password' name='pw_confirm'><br>
이름 : <input type='text' name='user_name'><br>
전화번호 : <input type='text' name='user_phone'><br>
<br>
<input type='submit' value='가입하기'><br>
</form>
<br>

</body>
</html>