<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!--<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%> -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders Display Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Orders List</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Orders</a></li>
			</ul>
		</div>
	</nav>


	<div class="container">

		<header>
			<h1>Orders List is Displayed Below</h1>
		</header>
		<div class="starter-template">
			<h1>Order List</h1>
			<table
				class="table table-striped table-hover table-condensed table-bordered" border="1">
				<tr>
					<th>OrderId</th>
					<th>FullName</th>
					<th>Email</th>
					<th>Address</th>
					<th>Model</th>
					<th>Quantity</th>
					<th>Total</th>
					<th>Date</th>
					<th>ModeOfPayment</th>
				</tr>

		    	<c:forEach items="${orders}" var="order">
		    	<tr>
					<td>${order.orderid}</td>
					<td>${order.fullname}</td>
					<td>${order.email}</td>
					<td>${order.address}</td>
					<td>${order.model}</td>
					<td>${order.quantity}</td>
					<td>${order.total}</td>
					<td>${order.date}</td>
					<td>${order.modeofpayment}</td>
				</tr> 
		    	</c:forEach>

			</table>
		</div>
		<a href="/adminlogin">Go Back</a>
	</div>

</body>
</html>