<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center" style="font-family: serif; background-color:gray; margin: 0px;">Customers List</h1>
	<div align="center">
	<table class="table table-striped table-dark" style="width:100%">
	<thead>
		<tr>
		<th>Room NO</th>
		<th>Ac/non-Ac</th>
		<th>Cleaned/Dirty</th>
		<th>Number Of Beds</th>
		<th>Room Price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="rooms" items="${rooms}">
			<tr>
			<td>${rooms.room_id}</td>
			<td>${rooms.comfort}</td>
			<td>${rooms.room_condition}</td>
			<td>${rooms.no_beds}</td>
			<td>${rooms.room_cost}</td>
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</div>
</body>
</html>