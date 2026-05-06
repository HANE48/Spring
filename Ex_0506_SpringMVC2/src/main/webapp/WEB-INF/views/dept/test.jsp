<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		집에 가고 싶다
		<c:forEach var="i" items="${arr}">
			${i}<br/>
		</c:forEach>
		ip: ${ip}
	</body>
</html>