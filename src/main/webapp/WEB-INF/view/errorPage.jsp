<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>${exception}</h3>
	<sec:authorize access='hasAuthority("admin")'>
		<a href="${request.getContextPath()}/administrator">Goto Home</a>
	</sec:authorize>
	<sec:authorize access='hasAuthority("cust")'>
		<a href="${request.getContextPath()}/customer">Goto Home</a>
	</sec:authorize>
	<sec:authorize access='hasAuthority("recep")'>
		<a href="${request.getContextPath()}/receptionist">Goto Home</a>
	</sec:authorize>
</body>
</html>