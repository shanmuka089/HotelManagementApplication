<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/finalPayment.css" />
</head>
<body>
	
	<div align="center" class="page">
		<div class="container">
			<div class="row">
			<div class="col-md-4">
			
			</div>
			<div class="col-md-4 card">
			<h1 align="center">Payment Details</h1>
			<hr>
				<form:form action="/paymentProcess" modelAttribute="payment">
					<table cellpadding="8px" cellspacing="8px">
						<tr>
							<td><b>Payment Id</b></td>
							<td>
							<span><form:input path="payment_id"/></span>
							<form:errors path="payment_id" class="error"/>
							</td>
						</tr>
						<tr>
							<td><b>User Name</b></td>
							<td>
							<span><form:input path="user_name" value="${paymentCheckOut.user_name}"/></span>
							<form:errors path="user_name" class="error"/>
							</td>
						</tr>
						<tr>
							<td><b>Amount</b></td>
							<td>
							<span><form:input path="amount" value="${paymentCheckOut.amount}"/></span>
							<form:errors path="amount" class="error"/>
							</td>
						</tr>
						<tr>
							<td><b>Tax</b></td>
							<td>
							<span><form:input path="tax" value="${paymentCheckOut.tax}"/></span>
							<form:errors path="tax" class="error"/>
							</td>
						</tr>
						<tr>
							<td><b>Total Amount</b></td>
							<td>
							<span><form:input path="total_amount" value="${paymentCheckOut.total_amount}"/></span>
							<form:errors path="total_amount" class="error"/>
							</td>
						</tr>
						<tr>
							<td><b>Credit-card Number</b></td>
							<td>
							<span><form:input path="credit_num"/></span>
							<form:errors path="credit_num" class="error"/>
							</td>
						</tr>
						<tr>
							<td><b>Ifsc Code</b></td>
							<td>
							<span><form:input path="ifsc_code"/></span>
							<form:errors path="ifsc_code" class="error"/>
							</td>
						</tr>
						
						<tr>
							<td><b>Booked Time</b></td>
							<td>
							<span><form:input path="timeStamp" value="${timeStamp}"/></span>
							<form:errors path="timeStamp" class="error"/>
							</td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit" class="btn btn-success payment pbtn" value="Payment Now"></td>
						</tr>
					</table>
				</form:form>
			</div>
			<div class="col-md-4">
			
			</div>
			</div>
		</div>
	</div>
</body>
</html>