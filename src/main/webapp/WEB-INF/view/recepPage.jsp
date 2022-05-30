<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/recep.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<div class="profile-img">
					<img src="${imageName}" class="image" />
					<div class="file btn btn-lg btn-primary">
					<form:form action="uploadImage" method="post">
						Add Photo <input type="image" accept="image/png,image/jpeg" name="image" />
					</form:form>
					</div>
				</div>
			</div>
			<div class="col-md-2">
				<br>
				<br> <a class="profile-edit-btn update"
					href="/recepUpdatePage/${receptionist.recep_id}">Edit profile</a><br>
					<form:form action="logout" method="post">
						<br>
						<input type="submit" class="profile-edit-btn update" value="logout">
					</form:form>
			</div>
		</div>

		<div class="row recepname">
			<div class="col-md-12">
				<h1 class="title">Welcome! ${receptionist.recep_name}</h1>
				<hr>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="row">
					<div class="col-md-6">
						<label>User Id</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_id}</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label>Name</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_name}</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label>Gender</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_gender}</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label>Email</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_mail}</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label>Phone</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_mobile}</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label>City</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_city}</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label>State</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_state}</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label>country</label>
					</div>
					<div class="col-md-6">
						<p>${receptionist.recep_country}</p>
					</div>
				</div>

			</div>
			<div class="col-md-6 recepCard">
				<a class="btn btn-success rc" href="/customerBooking">Customer Booking</a><br>
				<a class="btn btn-info rc" href="${request.getContextPath()}/showCustomers">Show Customers</a><br>
				<a class="btn btn-secondary rc" href="${request.getContextPath()}/bookedRooms">Booked Rooms</a><br>
				<a class="btn btn-dark rc" href="${request.getContextPath()}/availableRooms">Available Rooms</a><br>
				<a class="btn btn-primary rc" href="${request.getContextPath()}/showBookedCustomers">Booking History</a><br>
			
			</div>
			
	</div>

</body>
</html>