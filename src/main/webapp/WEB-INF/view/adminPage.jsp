<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/admin.css" />
</head>
<body>
<div class="container">
	<div class="row">
	<div class="col-md-10">
		<h1 class="title">Welcome! ${name}</h1>
	</div>
	<div class="col-md-2">
		<form:form action="logout" method="post">
		<br>
		<input type="submit" class="profile-edit-btn logout" value="logout">
		</form:form>
	</div>
	</div>
	<hr>
	<div class="row">
		<div class="col-md-4 resources text">
			<h3 align="center">Resources Management</h3>
			<a href="/showAllRooms" class="btn btn-success">Show Rooms</a>
			<br><br>
			<a href="/showCleanRooms" class="btn btn-info">Conditional Rooms</a>
			<br><br>
			<a href="/showDirtyRooms" class="btn btn-warning">UnConditional Rooms</a>
			<br><br>
			<a href="/addRoom" class="btn btn-primary">Add Rooms</a>
			<br><br>
			<a href="/deleteRoom" class="btn btn-danger">delete Rooms</a>
			<br><br>
			<a href="/updateRoom" class="btn btn-secondary">Update Rooms</a>
			<br><br>
			<a href="#" class="btn btn-info">Inventories Available</a>
		</div>
		
		<div class="col-md-4 receptionist text">
			<h3 align="center">Receptionist Management</h3>
			<a href="/showReceptionists" class="btn btn-success">Show Receptionists</a>
			<br><br>
			<a href="/recepDelete" class="btn btn-danger">Delete Receptionists</a>
			<br><br>
			<a href="/recepReg" class="btn btn-primary">Add Receptionists</a>
			<br><br>
			<a href="/recepUpdate" class="btn btn-secondary">Update Receptionists</a>
		</div>
		
		<div class="col-md-4 customer text">
			<h3 align="center">Customer Management</h3>
			
			<a href="/showCustomers" class="btn btn-success">Show Customers</a>
			<br><br>
			<a href="/deleteCustom" class="btn btn-danger">Delete Customers</a>
			<br><br>
			<a href="/updateCustom" class="btn btn-secondary">Update Customers</a>
			<br><br>
			<a href="${request.getContextPath()}/showBookedCustomers" class="btn btn-info">Booking History</a>
			<br><br>
			<a href="/loggedUsers" class="btn btn-primary">Show Active Users</a>
			<br><br>
		</div>
	</div>
</div>

</body>
</html>