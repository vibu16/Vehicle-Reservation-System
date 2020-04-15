<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<title>VIEW VEHICLE</title>
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		class="button1" href="Logout.jsp"><b>LOGOUT</b></a> <a id="nav-menu"
		class="button1" href="Admin_Home.jsp"><b>HOME</b></a> </header>
	<marquee>
		<h4>10% discount on paying through SBI || Apply coupon promo05
			for 5% discount.</h4>
	</marquee>
	<h1 id="h1-center">VEHICLE DETAILS</h1>
	<h1 id="h1-center">${add}</h1>
	<table class="center">
		<div>
			<tr>
				<th id="size">Vehicle Name</th>
				<th id="size">Vehicle Model</th>
				<th id="size">Vehicle No</th>
				<th id="size">Color</th>
				<th id="size">Branch</th>
				<th id="size">Seating Capacity</th>
				<th id="size">Price per Day</th>
				<th id="size">Year of Manufacture</th>
				<th id="size">Insurance Date</th>
				<th id="size">Last Service Date</th>
				<th id="size">Service Due</th>
				<th id="size">Next Available Date</th>

			</tr>

			<c:forEach items="${viewVehicles }" var="vehicle">
				<tr>
					<td id="size">${vehicle.name}</td>
					<td id="size">${vehicle.vehicleType}</td>
					<td id="size">${vehicle.vehicleNumber}</td>
					<td id="size">${vehicle.color}</td>
					<td id="size">${vehicle.branch}</td>
					<td id="size">${vehicle.seatingCapacity}</td>
					<td id="size">${vehicle.price}</td>
					<td id="size">${vehicle.yearOfManufacture}</td>
					<td id="size">${vehicle.insuranceExpiryDate}</td>
					<td id="size">${vehicle.lastServicedDate}</td>
					<td id="size">${vehicle.serviceDueDate}</td>
					<td id="size">${vehicle.nextAvailableDate}</td>
					<td></td>

					<td><a name="Edit"
						href="ShowEditVehicle?vehinum=${vehicle.vehicleNumber}"
						class="button" id="size">EDIT</a> <a name="Delete"
						href="RemoveVehicle?vehinum=${vehicle.vehicleNumber}"
						class="button" id="size">DELETE</a></td>
				</tr>
			</c:forEach>
		</div>
	</table>
	<footer> Copyrights@2019 </footer>


</body>
</html>