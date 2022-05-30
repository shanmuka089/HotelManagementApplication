<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/recepPage.css" />
</head>
<body>
	<div align="center" class="regCard">
	<h1>Update Receptionist</h1>
		<form:form action="/recepUpdateProces" modelAttribute="receptionist">
			<div class="container">
				<div class="row">
					<div class="col-md-2 space">
						<label for="id">Id</label>
					</div>
					<div class="col-md-4 space">
						<form:input path="recep_id" class="form-control" id="id"
							placeholder="Id" />
						<form:errors path="recep_id" class="error" />
					</div>
					<div class="col-md-2 space">
						<label for="inpu">Name</label>
					</div>
					<div class="col-md-4 space">
						<form:input path="recep_name" class="form-control" id="inpu"
							placeholder="Name" />
						<form:errors path="recep_name" class="error" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-2 space">
						<label for="inp">Mobile</label>
					</div>
					<div class="col-md-4 space">
						<form:input path="recep_mobile" class="form-control" id="inp"
							placeholder="Mobile" />
						<form:errors path="recep_mobile" class="error" />
					</div>
					<div class="col-md-2 space">
						<label>Gender</label>
					</div>
					<div class="col-md-4 space">
						<form:radiobutton path="recep_gender" value="male" class="rad1" />
						Male
						<form:radiobutton path="recep_gender" value="female"  class="rad2"/>
						FeMale
						<form:errors path="recep_gender" class="error" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-2 space">
						<label for="inputCity">City</label>
					</div>
					<div class="col-md-4 space">
						<form:input path="recep_city" class="form-control" id="inputCity"
							placeholder="city" />
						<form:errors path="recep_city" class="error" />
					</div>
					<div class="col-md-2 space">
						<label for="inputdate">Registration date</label>
					</div>
					<div class="col-md-4 space">
						<form:input type="date" path="recep_date" id="inputdate" />
						<form:errors path="recep_date" class="error" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-2 space">
						<label for="inps">State</label>
					</div>
					<div class="col-md-4 space">
						<form:input path="recep_state" class="form-control" id="inps"
							placeholder="State" />
						<form:errors path="recep_state" class="error" />
					</div>
					<div class="col-md-2 space">
						<label for="inpc">Country</label>
					</div>
					<div class="col-md-4 space">
						<form:input path="recep_country" class="form-control" id="inpc"
							placeholder="country" />
						<form:errors path="recep_country" class="error" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-2 space">
						<label for="inpsd">Password</label>
					</div>
					<div class="col-md-4 space">
						<form:input type="password" path="password" class="form-control" id="inpsd"
							placeholder="password" />
						<form:errors path="password" class="error" />
					</div>
					<div class="col-md-2 space">
						<label for="in">Mail</label>
					</div>
					<div class="col-md-4 space">
						<form:input path="recep_mail" class="form-control" id="in"
							placeholder="Mail" />
						<form:errors path="recep_mail" class="error" />
					</div>
				</div>
				<div class="row">
					<div class="col-md-12 space">
					<div align="center" class="space">
					<input type="submit" class="btn btn-success bt" value="Update"> <input type="reset" class="btn btn-info bt"
						value="Reset">
					</div>
				</div>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>