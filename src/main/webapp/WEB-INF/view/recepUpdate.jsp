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
	<h1 align="center" style="font-family: serif; background-color:gray; margin: 0px;">Update Receptionists</h1>
	<div align="center">
	<table class="table table-striped" style="width:100%">
	<thead>
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Gender</th>
		<th>State</th>
		<th>City</th>
		<th>Mail</th>
		<th>Mobile</th>
		<th>Registered Date</th>
		<th>Country</th>
		<th>update</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="receptionist" items="${receptionists}">
			<tr>
			<td>${receptionist.recep_id}</td>
			<td>${receptionist.recep_name}</td>
			<td>${receptionist.recep_gender}</td>
			<td>${receptionist.recep_state}</td>
			<td>${receptionist.recep_city}</td>
			<td>${receptionist.recep_mail}</td>
			<td>${receptionist.recep_mobile}</td>
			<td>${receptionist.recep_date}</td>
			<td>${receptionist.recep_country}</td>
			<td><a href="recepUpdatePage/${receptionist.recep_id}">update</a></td>
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</div>
</body>
</html>