<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<style type="text/css">
div {
	margin: 100px;
}

.btn {
	margin: 5px
}

h1 {
	font-family: serif;
}

.error {
	color: red;
	margin-left: 20px;
	position: fixed;
}

body {
	background-color: rgb(5, 1, 66);
	color: white;
}
</style>
<script type="text/javascript">
	function validate() {
		var password = document.getElementById('pass1').value;
		var password2 = document.getElementById('pass2').value;
		var username = document.getElementById('name').value;
		if (username.length < 1) {
			alert("your name cannot be empty!")
			return false;
		}
		if (password.length < 1) {
			alert("password creation field cannot be empty!")
			return false;
		}
		if (password2.length < 1) {
			alert("please re-enter your created password!")
			return false;
		}
		if (password.length != password2.length)){
			alert("your created password & re-entered password must be match!.")
			return false;
		}
		if(!(password.localeCompare(password2))){
			alert("your created password & re-entered password must be match!.")
			return false;
		}
		else{
			return true;
		}
	}
</script>
</head>
<body>
	<div align="center">
		<h1 align="center">Forgot Password</h1>
		<hr>
		<form:form action="${request.getContextPath()}/forgot-process"
			modelAttribute="login" onsubmit="return validate()">
			<table cellpadding="5px" cellspacing="5px">
				<tr>
					<td><label>userName</label></td>
					<td><form:input type="text" path="username" id="name"/> <form:errors
							path="username" class="error" /></td>
				</tr>
				<tr>
					<td><label>create your password</label></td>
					<td><form:input type="password" path="password" id="pass1" />
						<form:errors path="password" class="error" /></td>
				</tr>
				<tr>
					<td><label>Re-enter your password</label></td>
					<td><form:input type="password" path="password2" id="pass2" />
						<form:errors path="password2" class="error" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="update" class="btn btn-success" /> <input type="reset"
						value="Reset" class="btn btn-info" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>