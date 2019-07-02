<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>부서별 사원</h1>
	
	<ul>
		<c:forEach var="e" items="${emp }">
				<li><a href="employee.do?empid=${e.id}">${e.firstName} &nbsp; ${e.lastName }</a></li>
		</c:forEach>
	</ul>
</body>
</html>