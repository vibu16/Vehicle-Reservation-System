<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<title>Admin Home</title>

<link href="./css/style.css" rel="Stylesheet" type="text/css" />

</head>

<body class="body">

	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		class="button1" href="LogoutServlet"><b>LOGOUT</b></a> <a
		id="nav-menu" class="button1" href="Admin_Home.jsp"><b>HOME</b></a> </header>
	<marquee>
		<h4>10% discount on paying through SBI || Apply coupon promo05
			for 5% discount.</h4>
	</marquee>

	<table class="center">
		<div>
			<tr>
				<td><a href="AddVehicle.jsp" class="button2" id="size"><b>ADD
							VEHICLE</b></a></td>
				<td></td>
				<td></td>
				<td><a href="AdminSearch.jsp" class="button2" id="size"><b>SEARCH
							VEHICLE</b></a></td>
				<td></td>
				<td><a href="AdminViewBookingDetails" class="button2" id="size"><b>VIEW
							BOOKED VEHICLE</b></a></td>
			</tr>
			<tr>
				<td><a href="ShowPendingListServlet" class="button2" id="size"><b>APPROVE
							LOGIN</b></a></td>
				<td></td>
				<td></td>
				<td><a href="InsuranceEndDate" class="button2" id="size"><b>INSURANCE
							END DATE</b></a></td>
				<td></td>
				<td><a href="AdminViewCancelDetails" class="button2" id="size"><b>VIEW
							CANCELLED VEHICLE</b></a></td>
			</tr>
			<tr>
				<td><a href="AdminViewVehicleServlet" class="button2" id="size"><b>VIEW
							VEHICLE</b></a></td>
				<td></td>
				<td></td>
				<td><a href="ServiceDueDate" class="button2" id="size"><b>SERVICE
							DUE DATE</b></a></td>
			</tr>
		</div>
	</table>

	<footer> Copyrights@2019 </footer>

</body>
</html>
