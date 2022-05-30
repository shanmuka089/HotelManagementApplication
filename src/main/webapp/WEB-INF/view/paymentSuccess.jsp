<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/paymentPage2.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-5 card details">
				<h1 align="center">Booking Details</h1>
				<hr>
				<table cellpadding="5px" cellspacing="5px">
					<tr>
						<td><b>User Name :</b></td>
						<td><h4>${booking.user_name}</h4></td>
					</tr>
					<tr>
						<td><b>Booking Id :</b></td>
						<td><span>${booking.booking_id}</span></td>
					</tr>
					<tr>
						<td><b>Adhar Number :</b></td>
						<td><span>${booking.adhar_number}</span></td>
					</tr>
					<tr>
						<td><b>Number Of Guests :</b></td>
						<td><span>${booking.no_guests}</span></td>
					</tr>
					<tr>
						<td><b>Number Of Rooms :</b></td>
						<td><span>${booking.no_rooms}</span></td>
					</tr>
					<tr>
						<td><b>Number of Days :</b></td>
						<td><span>${booking.no_days}</span></td>
					</tr>
					<tr>
						<td><b>Preferred AC/non-AC :</b></td>
						<td><span>${booking.comfort}</span></td>
					</tr>
					<tr>
						<td><b>Check-in Date :</b></td>
						<td><span>${booking.check_in}</span></td>
					</tr>
					<tr>
						<td><b>Check-out Date :</b></td>
						<td><span>${booking.check_out}</span></td>
					</tr>
					<tr>
						<td><b>Room Allocated :</b></td>
						<td><span>${paymentCheckOut.room_no}</span></td>
					</tr>
					<tr>
						<td><b>Payment Status :</b></td>
						<td><strong class="status">${paystatus}</strong></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><sec:authorize
								access='hasAuthority("cust")'>
								<a href="${request.getContextPath()}/sessionInvalidate"
									class="btn btn-success payment">Click here go to Home</a>
							</sec:authorize> <sec:authorize access='hasAuthority("recep")'>
								<a href="${request.getContextPath()}/sessionInvalidated"
									class="btn btn-success payment">Click here go to Home</a>
							</sec:authorize></td>
					</tr>
				</table>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
</body>
</html>