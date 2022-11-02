<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

$(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$(".join_button").click(function(){
		$("#join_form").attr("action", "/member/join");
		$("#join_form").submit();
	});
});

</script>
</head>
<body>

	<form action="post" id="join_form">
		<span>회원가입</span> 
		아이디	<input class="id_input" name="Id"> 
		비밀번호	<input class="pw_input" name="m_pw">
		이름 	<input class="user_input" name="m_name"> 
		이메일 	<input class="mail_input" name="m_email"> 
		전화번호	<input class="phone_input" name="m_phone"> 
		생일		<input class="birth_input" name="m_birth"> 
		<input type="button" class="join_button" value="가입하기">

	</form>
</body>
</html>