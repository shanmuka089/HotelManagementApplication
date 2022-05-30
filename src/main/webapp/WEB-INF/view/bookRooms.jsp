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
	<h1 align="center" style="font-family: serif; background-color:gray; margin: 0px;">Receptionists List</h1>
	<div align="center">
	<table class="table table-striped" style="width:100%">
	<thead>
		<tr>
		<th>Room Id</th>
		<th>Ac/non-Ac</th>
		<th>Room Condition</th>
		<th>No Of Beds</th>
		<th>Room Cost</th>
		<th>Room Booked</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="room" items="${bookRooms}">
			<tr>
			<td>${room.room_id}</td>
			<td>${room.comfort}</td>
			<td>${room.room_condition}</td>
			<td>${room.no_beds}</td>
			<td>${room.room_cost}</td>
			<td>${room.in_use}</td>
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</div>
</body>
</html>