<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/registration.css"/>
</head>
<body>
<header>
		<h1 class="title">Virtusa Hotel</h1>
	</header>
	<nav>
		<div class="links">
			<a href="${request.getContextPath()}/come">Home</a>
			<a href="#">About us</a> 
			<a href="#">Support</a>
			<a href="#">Features</a>
		</div>
	</nav>
<h1 align="center" id="title">User Registration</h1>

<form:form action="cust-regProcess" method="post" modelAttribute="customer">
	<div align="center" id="page">
		<table cellpadding="10px" cellspacing="12px">
			<tr>
			<td><label for="name">enter your Name</label></td>
			<td><form:input type="text" path="customer_name" id="name" />
			<form:errors path="customer_name" class="error"/>
			</td>
			</tr>
			<tr>
			<td><label for="gender">select your gender</label></td>
			<td>
			Male:<form:radiobutton path="customer_gender" value="male"/>
			FeMale<form:radiobutton path="customer_gender" value="female"/>
			<form:errors path="customer_gender"  class="error"/>
			</td>
			</tr>
			<tr>
			<td><label for="state">enter your State</label></td>
			<td>
			<form:input type="text" path="customer_state" id="state" />
			<form:errors path="customer_state" class="error"/>
			</td>
			</tr>
			<tr>
			<td><label for="city">enter your City</label></td>
			<td><form:input type="text" path="customer_city" id="city"/>
			<form:errors  path="customer_city" class="error"/>
			</td>
			<tr>
			<td>
			<label>Country : </label></td>
			<td>
				<form:select path="customer_country">
					<form:option value="ind" label="India"></form:option>
					<form:option value="aus" label="Australia"></form:option>
					<form:option value="pak" label="Pakisthan"></form:option>
					<form:option value="srl" label="Srilanka"></form:option>
					<form:option value="uae" label="UAE"></form:option>
					<form:option value="swd" label="Switzerland"></form:option>
				</form:select>
				<form:errors path="customer_country" class="error" />
			</td>
			</tr>
			<tr>
			<td><label for="mail">enter your Mail</label></td>
			<td>
			<form:input type="email" path="customer_mail" id="mail" />
			<form:errors path="customer_mail" class="error"/>
			</td>
			</tr>
			<tr>
			<td><label for="mobile">enter your Mobile Number</label></td>
			<td><form:input type="text" path="customer_mobile" id="mobile" />
			<form:errors path="customer_mobile" class="error"/>
			</td>
			</tr>
			<tr>
			<td><label for="date">Registration Date</label></td>
			<td><form:input type="date" path="customer_date" id="date" />
			<form:errors path="customer_date" class="error"/>
			</td>
			</tr>
			<tr>
			<td><label for="password">Create password</label></td>
			<td><form:input type="password" path="customer_password" id="password" />
			<form:errors path="customer_password" class="error"/>
			</td>
			</tr>
			<tr>
			<td colspan="2" align="center"><input type="submit" class="btn btn-success" value="Register"/>
			<input type="reset" class="btn btn-info" value="reset"/></td>
			</tr>
		</table>
	</div>
</form:form>

</body>
</html>