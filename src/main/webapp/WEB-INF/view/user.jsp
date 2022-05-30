<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="/css/user.css" />
</head>
<body>
	<div class="container emp-profile">
			<div class="row">
				<div class="col-md-4">
					<div class="profile-img">
						<img src="/images/person.png" class="image"/>
					
						<div class="file btn btn-lg btn-primary">
							Change Photo <input type="file" name="file" />
						</div>
					</div>
					
					<a href="getBookingDetails/${customer.customer_name}" class="btn btn-info myBt" >My Booking Details</a>
					
				</div>
				
				<div class="col-md-6">
					<div class="profile-head">
						<h5>${customer.customer_name}</h5>
						<h6>Java Developer</h6>
						<div class="profile-works">
						<p>About</p>
						</div>
						<hr>
						<form:form>
							<div class="row">
								<div class="col-md-6">
									<label>User Id</label>
								</div>
								<div class="col-md-6">
									<p>${customer.customer_id}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Name</label>
								</div>
								<div class="col-md-6">
									<p>${customer.customer_name}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Gender</label>
								</div>
								<div class="col-md-6">
									<p>${customer.customer_gender}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Email</label>
								</div>
								<div class="col-md-6">
									<p>${customer.customer_mail}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Phone</label>
								</div>
								<div class="col-md-6">
									<p>${customer.customer_mobile}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>City</label>
								</div>
								<div class="col-md-6">
									<p>${customer.customer_city}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>country</label>
								</div>
								<div class="col-md-6">
									<p>${customer.customer_country}</p>
								</div>
							</div>
							</form:form>
					</div>
				</div>
				<div class="col-md-2">
					<a class="profile-edit-btn update" href="/updateCustomer/${customer.customer_id}">Edit profile</a><br>
					<a class="profile-edit-btn update" href="/deleteCustomer/${customer.customer_name}">Delete Account</a>
					<form:form action="logout" method="post">
						<br>
						<input type="submit" class="profile-edit-btn updates" value="logout">
					</form:form>
				</div>
			</div>
			
<!-- ----------------------------------------------------------------------------------- -->

		<div class="row">
			<div class="col-md-12">
				<div class="profile-work">
					<p>Room Booking Details</p>
				</div>
			</div>
		</div>
		<hr>
		<form:form action="/bookingProcess" modelAttribute="booking">
		<div class="row">	
			<div class="col-md-3">
				<label for="guests">No of Guests</label>
			</div>
			<div class="col-md-3">
				<form:input type="text" path="no_guests" id="guests" />
				<form:errors path="no_guests" class="error"/>
			</div>
			<div class="col-md-2">
				<label for="rooms">No of Rooms</label>
			</div>
			<div class="col-md-1">
				<form:input type="text" path="no_rooms" id="rooms" />
				<form:errors path="no_rooms" class="error"/>
			</div>
			<div class="col-md-2">
				<label for="days">No of Days</label>
			</div>
			<div class="col-md-1">
				<form:input type="text" path="no_days" id="days" />
				<form:errors path="no_days" class="error"/>
			</div>
		</div>
		<div class="row">	
			<div class="col-md-3">
				<label for="adhar">Adhar number</label>
			</div>
			<div class="col-md-3">
				<form:input type="text" path="adhar_number" id="adhar" />
				<form:errors path="adhar_number" class="error2"/>
			</div>
			<div class="col-md-3">
				<label for="comfort">Select Ac/non-Ac</label>
			</div>
			<div class="col-md-3">
				Ac<form:radiobutton path="comfort"  class="bt" value="Ac"/>
				non-Ac<form:radiobutton path="comfort" class="bt" value="non-Ac"/>
				<form:errors path="comfort" class="error"/>
			</div>
		</div>
		<div class="row">	
			<div class="col-md-3">
				<label for="in">Check in date</label>
			</div>
			<div class="col-md-3">
				<form:input type="date" class="date" path="check_in" id="in" />
				<form:errors path="check_in" class="error2"/>
			</div>
			<div class="col-md-3">
				<label for="out">Check out date</label>
			</div>
			<div class="col-md-3">
				<form:input type="date" class="date" path="check_out" value="out"/>
				<form:errors path="check_out" class="error"/>
			</div>
		</div>
		<div class="row">	
			<div class="col-md-8">
				Are you agree with the rules which can be provided by hotel <form:checkbox path="check_box" class="approve"/>
				<form:errors path="check_box" class="error3"/>
			</div>
			<div class="col-md-4">
				<input type="submit" class="btn btn-success" value="makepayment">
			</div>
		</div>
		</form:form>
	</div>
</body>
</html>