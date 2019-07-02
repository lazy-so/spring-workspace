<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 사원 상세정보</h1>
	
		<p>아이디 : ${employee.id } </p>
		<p>이름: ${employee.firstName } / ${employee.lastName } </p>
		<p>이메일 : ${employee.email } </p>
		<p>전화번호 : ${employee.id } </p>
		<p>급여 : ${employee.salary } </p>

</body>
</html>