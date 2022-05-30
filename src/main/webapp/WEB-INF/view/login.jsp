<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/loginpage.css"/>
<script type="text/javascript">
function validate(){
	var username=document.getElementById('name').value;
	if(username.length < 1){
		alert("your name cannot be empty!")
		return false;
	}
	var password=document.getElementById('pass').value;
	if(password.length < 1){
		alert("your password cannot be empty!")
		return false;
	}
	var password2=document.getElementById('pass2').value;
	if(password2.length < 1){
		alert("please re-enter your password!")
		return false;
	}
}
</script>
</head>
<body>
<div class="container-fluid">
<div class="header col-md-12 col-sm-12 col-lg-12">
	<header>
         <div class="title"> <h1>Virtusa Hotel</h1></div>
    </header>
</div>

<div class="nav col-md-12 col-sm-12 col-lg-12" id="out">  
    <nav class="links">
        
            <a href="come">Home</a>
            <a href="about">About us</a>
            <a href="support">Support</a>
            <a href="features">Features</a>
  
    </nav>
  </div>
	<div align="center" class="login">
	<h1>Login Page</h1>
	<hr>
	<c:if test="${param.error != null}">
		<i style="color:red">* please enter valid username & password</i>
	</c:if>

	<c:if test="${param.logout != null}">
		<i style="color:darkgreen">* you logged out successfully! please login again.</i>
	</c:if>


		<form:form action="process-login" method="post" modelAttribute="login" onsubmit="return validate()">
			<table cellpadding="5px" cellspacing="5px">
				<tr>
					<td><label for="name">UserName</label></td>
					<td><form:input type="text" path="username" id="name"/></td>
				</tr>
				<tr>
					<td><label for="pass">Password</label></td>
					<td><form:input type="password" path="password" id="pass" /></td>
				</tr>
				<tr>
					<td><label for="pass2">Confirm Password</label></td>
					<td><form:input type="password" path="password2" id="pass2" /></td>
				</tr>
				<tr>
					<td><label for="remember"> Remember me</label></td>
					<td><input type="checkbox" name="remember" /> </td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit"value="login"  class="btn btn-success"/> 
					<input type="reset" value="Reset"  class="btn btn-info"/></td>
				</tr>
			</table>
		</form:form>
		<p>New user?<a href="cust-reg" id="reg">Register here</a> | <a href="/forgotPassword" id="reg">forgot password?</a></p>
	</div>
	</div>
</body>
</html>