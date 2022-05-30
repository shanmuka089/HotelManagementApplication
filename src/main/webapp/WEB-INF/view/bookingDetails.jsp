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
	<h1 align="center" style="font-family: serif; background-color:gray; margin: 0px;">Customer Booking List</h1>
	<div align="center">
	<table class="table table-striped" style="width:100%">
	<thead>
		<tr>
		<th>Booking Id</th>
		<th>No Of Guests</th>
		<th>No Of Rooms</th>
		<th>No Of Days</th>
		<th>Adhar Number</th>
		<th>Ac/non-Ac</th>
		<th>Check-In</th>
		<th>Check-Out</th>
		<th>Payment Status</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="customer" items="${bookCustomers}">
			<tr>
			<td>${customer.booking_id}</td>
			<td>${customer.no_guests}</td>
			<td>${customer.no_rooms}</td>
			<td>${customer.no_days}</td>
			<td>${customer.adhar_number}</td>
			<td>${customer.comfort}</td>
			<td>${customer.check_in}</td>
			<td>${customer.check_out}</td>
			<td>${customer.payment_status}</td>
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</div>
</body>
</html>