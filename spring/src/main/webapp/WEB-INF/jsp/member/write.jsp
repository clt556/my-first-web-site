<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여따 입력해서 DB에 넣음</title>
</head>
<body>	
	<h1>회원 등록</h1>
	<form action="insert.do" method="post" enctype="multipart/form-data">
		아이디:<input type="text" name="id"><br>
		비밀번호: <input type="password" name="pwd"><br>
		이름:<input type="text" name="name"><br>
		이메일:<input type="text" name="email"><br>
		성별:<input type="checkbox" name="gender" value="1" checked>여<br>
			<input type="checkbox" name="gender" value="0">남<br>
		사진:<input type="file" name="filename"><br>
		취미: <input type="checkbox" name="hobby" value="1">게임
		<input type="checkbox" name="hobby" value="2">영화
		<input type="checkbox" name="hobby" value="3">독서
		<input type="checkbox" name="hobby" value="4">낚시
		<input type="submit" value="가입">
	</form>
	
</body>
</html>