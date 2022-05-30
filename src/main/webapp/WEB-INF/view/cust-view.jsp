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
	<h1 align="center" style="font-family: serif; background-color:gray; margin: 0px;">Customers List</h1>
	<div align="center">
	<table class="table table-striped table-dark" style="width:100%">
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
		</tr>
	</thead>
	<tbody>
		<c:forEach var="customer" items="${customerList}">
			<tr>
			<td>${customer.customer_id}</td>
			<td>${customer.customer_name}</td>
			<td>${customer.customer_gender}</td>
			<td>${customer.customer_state}</td>
			<td>${customer.customer_city}</td>
			<td>${customer.customer_mail}</td>
			<td>${customer.customer_mobile}</td>
			<td>${customer.customer_date}</td>
			<td>${customer.customer_country}</td>
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</div>
</body>
</html>