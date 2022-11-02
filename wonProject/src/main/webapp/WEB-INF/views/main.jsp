<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<img src="이미지 경로" style="width: 100px; height: 100px;">
	<br> id :
	<input type="text" class ="id_input">
	<br> pwd :
	<input type="password" class ="pw_input">
	<br>
	<button type="button" onclick="location.href='/member/login'">로그인</button>
	<button type="button" onclick="location.href='/member/join'">회원가입</button>
</body>
</html>