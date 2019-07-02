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
	<h1>직종 리스트</h1>
	
	<ul>
		<c:forEach var="job" items="${jobs }">
			<li><a href="detail.do?id=${job.id}">${job.title}</a></li>
		</c:forEach>
	</ul>
	<a href="form.do">직종 추가</a>
</body>
</html>