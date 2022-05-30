<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<style type="text/css">
.data{
	margin-top: 100px;
}
.mar{
margin: 5px;
}
h1{
font-family: serif;
}
.error{
position:fixed;
color:red;
margin-left: 20px;
}
body{
	background-image: url("/images/recepReg.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	color: black;
	margin: 20px;
}

</style>
</head>
<body>
	<div class="container data">
		<form:form action="/customerbookingProcess" modelAttribute="booking">
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6 card">
					<div class="row mar">
						<div class="col-md-12">
							<div class="profile-work">
								<h1 align="center">Room Booking Details</h1>
								<hr>
							</div>
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="gue">Customer Name</label>
						</div>
						<div class="col-md-6">
							<form:input type="text" path="user_name" id="gue" />
							<form:errors path="user_name" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="guests">No of Guests</label>
						</div>
						<div class="col-md-6">
							<form:input type="text" path="no_guests" id="guests" />
							<form:errors path="no_guests" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="rooms">No of Rooms</label>
						</div>
						<div class="col-md-6">
							<form:input type="text" path="no_rooms" id="rooms" />
							<form:errors path="no_rooms" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="days">No of Days</label>
						</div>
						<div class="col-md-6">
							<form:input type="text" path="no_days" id="days" />
							<form:errors path="no_days" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="adhar">Adhar number</label>
						</div>
						<div class="col-md-6">
							<form:input type="text" path="adhar_number" id="adhar" />
							<form:errors path="adhar_number" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="comfort">Select Ac/non-Ac</label>
						</div>
						<div class="col-md-6">
							Ac
							<form:radiobutton path="comfort" class="bt" value="Ac" />
							non-Ac
							<form:radiobutton path="comfort" class="bt" value="non-Ac" />
							<form:errors path="comfort" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="in">Check in date</label>
						</div>
						<div class="col-md-6">
							<form:input type="date" class="date" path="check_in" id="in" />
							<form:errors path="check_in" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-6">
							<label for="out">Check out date</label>
						</div>
						<div class="col-md-6">
							<form:input type="date" class="date" path="check_out" value="out" />
							<form:errors path="check_out" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-12">
							Are you agree with the rules which can be provided by hotel
							<form:checkbox path="check_box" class="approve" />
							<form:errors path="check_box" class="error" />
						</div>
					</div>
					<div class="row mar">
						<div class="col-md-12" align="center">
							<input type="submit" class="btn btn-success" value="makepayment">
						</div>
					</div>
				</div>
				<div class="col-md-3"></div>
			</div>
		</form:form>
	</div>
</body>
</html>