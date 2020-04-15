<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>USER HOME</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
</head>
<body class="body">

	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		class="button1" href="Logout.jsp"><b>LOGOUT</b></a> <a id="nav-menu"
		class="button1" href="User_Home.jsp"><b>HOME</b></a> </header>
	<marquee>
		<h4>10% discount on paying through SBI || Apply coupon promo05
			for 5% discount.</h4>
	</marquee>

	<table class="center">
		<div>

			<tr>
				<td><a href="CustomerViewVehicleServlet" class="button2"
					id="size"><b>VIEW VEHICLE</b></a></td>
				<td><a href="Refund-Policy.jsp" class="button2" id="size"><b>REFUND
							POLICIES</b></a></td>
			</tr>
			<tr>
				<td><a href="CustomerSearch.jsp" class="button2" id="size"><b>SEARCH
							VEHICLE</b></a></td>
				<td><a href="CustomerViewBooking.jsp" class="button2" id="size"><b>VIEW
							BOOKED VEHICLE</b></a></td>
			</tr>
		</div>
	</table>

	<footer> Copyrights@2019 </footer>
</body>
</html>
