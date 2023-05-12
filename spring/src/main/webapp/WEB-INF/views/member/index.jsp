<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원목록</h1>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
	<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.id }</td>
			<td>${vo.pwd }</td>
			<td>${vo.name }</td>
			<td>${vo.email }</td>
			<td>${vo.joindate }</td>
		</tr>
	</c:forEach>
	</table>
	<a href="write.do">회원 등록</a>
</body>
</html>