<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./css/style.css" rel="Stylesheet" type="text/css" />

<title>USER VIEW VEHICLE</title>
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

	<ul>
		<li><a href="CustomerSearch.jsp" class="button" id="size">SEARCH</a></li>
	</ul>
	<table class="center">
		<div>
			<h1 id="h1-center">USER VIEW VEHICLE</h1>

			<tr>
				<th id="size">VehicleName</th>

				<th id="size">VehicleModel</th>

				<th id="size">VehicleNo</th>

				<th id="size">Color</th>

				<th id="size">SeatingCapacity</th>

				<th id="size">Price per Day</th>

				<th id="size">Next Available Date</th>

			</tr>

			<c:forEach items="${viewVehicles }" var="vehicle">
				<tr>
					<td id="size">${vehicle.name}</td>
					<td id="size">${vehicle.vehicleType}</td>
					<td id="size">${vehicle.vehicleNumber}</td>
					<td id="size">${vehicle.color}</td>
					<td id="size">${vehicle.seatingCapacity}</td>
					<td id="size">${vehicle.price}</td>
					<td id="size">${vehicle.nextAvailableDate}</td>
					<td><a name="book" class="button" id="size"
						href="ShowBookServlet?vehinum=${vehicle.vehicleNumber}">BOOK</a></td>
				</tr>
			</c:forEach>
		</div>
	</table>
	<footer> Copyrights@2019 </footer>
</body>
</html>