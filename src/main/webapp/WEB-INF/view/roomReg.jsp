<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/roomReg.css"/>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-lg-4 col-sm-12">

</div>

<div class="col-lg-4 col-sm-12">
<div align="center" class="card room" style="width: 500px;">
	<h1>Add Room</h1>
	<form:form action="roomProcess" modelAttribute="room">
		<table cellpadding="10px"; cellspacing="10px";>
			<tr>
			<td><label for="id">Room Id</label></td>
			<td>
			<form:input path="room_id" id="id"/>
			<form:errors class="error" path="room_id"/>
			</td>
			</tr>
			
			<tr>
			<td><label >Ac/non-Ac</label></td>
			<td>
			<form:radiobutton path="comfort" class="rad" value="Ac"/>
			Ac 
			<form:radiobutton path="comfort" class="rad2" value="non-Ac"/>
			non-Ac 
			<form:errors class="error" path="comfort"/>
			</td>
			</tr>
			
			<tr>
			<td><label >Condition Of the Room</label></td>
			<td>
			<form:radiobutton path="room_condition" class="rad" value="dirty"/>
			Dirty 
			<form:radiobutton path="room_condition" class="rad2" value="cleaned"/>
			Cleaned 
			<form:errors class="error" path="room_condition"/>
			</td>
			</tr>
			
			<tr>
			<td><label for="no">No of Beds in the room</label></td>
			<td>
			<form:input path="no_beds" id="no"/>
			<form:errors class="error" path="no_beds"/>
			</td>
			</tr>
			
			<tr>
			<td><label for="cost">Room Cost</label></td>
			<td>
			<form:input path="room_cost" id="cost"/>
			<form:errors class="error" path="room_cost"/>
			</td>
			</tr>
			
			<tr>
			<td colspan="2" align="center">
			<input type="submit" class="btn btn-success" value="Add Room">
			<input type="reset" class="btn btn-info" value="Reset">
			</td>
			</tr>
		</table>
	</form:form>
</div>
</div>
</div>
<div class="col-lg-4 col-sm-12">

</div>
</div>
</body>
</html>