<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center" style="font-family: serif; background-color:gray; margin: 0px;">Active Users List</h1>
	<div align="center">
	<table class="table table-striped" style="width:100%">
	<thead>
		<tr>
		<th>Active USers</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="user" items="${users}">
			<tr>
			<td>${user}</td>
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</div>
</body>
</html>