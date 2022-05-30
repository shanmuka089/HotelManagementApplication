<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Sign up here !</h1>

<form:form action="processSignup" method="post" modelAttribute="signUp">
	UserName :<form:input path="username"/><br>
	<br>
	Password :<form:password path="password"/>
	<br><br>
	<input type="submit" value="signup">
</form:form>
</body>
</html>