<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BOOKED VEHICLE LIST</title>
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
	<div>
		<h1 id="h1-center">VEHICLE DETAILS</h1>
		<table class="center">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>

			</tr>
			<tr>
				<th id="size">Vehicle Name</th>
				<th id="size">Vehicle Model</th>
				<th id="size">Vehicle No</th>
				<th id="size">Color</th>
				<th id="size">Branch</th>
				<th id="size">Insurance Expiry Date</th>
				<th id="size">Last Service Date1</th>
				<th id="size">Service Due</th>
				<th id="size">Status</th>
			</tr>

			<c:forEach items="${viewVehicles}" var="vehicle">
				<tr>
					<td id="size"><c:out value="${vehicle.vehicleName}"></c:out></td>
					<td id="size"><c:out value="${vehicle.vehicleModel}"></c:out></td>
					<td id="size"><c:out value="${vehicle.vehicleNumber}"></c:out></td>
					<td id="size"><c:out value="${vehicle.color}"></c:out></td>
					<td id="size"><c:out value="${vehicle.branch}"></c:out></td>
					<td id="size"><c:out value="${vehicle.yearOfManufacture}"></c:out></td>
					<td id="size"><c:out value="${vehicle.insuranceExpiryDate}"></c:out></td>
					<td id="size"><c:out value="${vehicle.lastServicedDate}"></c:out></td>
					<td id="size"><c:out value="${vehicle.serviceDueDate}"></c:out></td>
					<td id="size"><a
						href="delete?vehicleNumber=${vehicle.vehicleNumber}"
						class="button" id="size"> DELETE</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<footer> Copyrights@2019 </footer>

</body>
</html>