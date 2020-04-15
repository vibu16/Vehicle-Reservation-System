<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Vehicle`</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<script type="text/javascript" src="./js/script.js"></script>
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		class="button1" href="Logout.html"><b>LOGOUT</b></a> <a id="nav-menu"
		class="button1" href="Admin_Home.jsp"><b>HOME</b></a> </header>
	<marquee>
		<h4>10% discount on paying through SBI || Apply coupon promo05
			for 5% discount.</h4>
	</marquee>


	<h1 id="h1-center">EDIT VEHICLE</h1>
	<h1 id="h1-center">${add}</h1>
	<h1 id="h1-center">${msg}</h1>
	<form name="form" method="post"
		action="EditVehicle?vehinum=${vehicle.vehicleNumber}"
		onsubmit="return validate()">

		<table class="center">

			<tr>

				<td><label for="name" id="size"><b>Vehicle Name:</b></label></td>

				<td><input type="text" id="txt" id="name" name="vehiname"
					value="${vehicle.name}" autocomplete="off"></td>

			</tr>

			<tr>

				<td><label for="mod" id="size"><b>Vehicle Model:</b></label></td>

				<td><input type="text" id="txt" id="mod" name="vehimod"
					value="${vehicle.vehicleType}" autocomplete="off"></td>

			</tr>
			<tr>

				<td><label for="mod" id="size"><b>Seating Capacity:</b></label></td>

				<td><input type="text" id="txt" id="mod" name="capacity"
					value="${vehicle.seatingCapacity}" autocomplete="off"></td>

			</tr>
			<tr>

				<td><label for="price" id="size"><b>Price per Day:</b></label></td>

				<td><input type="text" id="txt" id="price" name="vehiprice"
					value="${vehicle.price}" autocomplete="off"></td>

			</tr>

			<tr>

				<td><label for="num" id="size"><b>Vehicle Number:</b></label></td>

				<td><input type="text" id="txt" id="num" name="vehinum"
					value="${vehicle.vehicleNumber}" autocomplete="off"></td>

			</tr>
			<tr>

				<td><label for="num" id="size"><b>Color:</b></label></td>

				<td><input type="text" id="txt" id="num" name="vehicolor"
					value="${vehicle.color}" autocomplete="off"></td>

			</tr>
			<tr>

				<td><label for="num" id="size"><b>Branch:</b></label></td>

				<td><input type="text" id="txt" id="num" name="vehibranch"
					value="${vehicle.branch}" autocomplete="off"></td>

			</tr>


			<tr>

				<td><label for="year" id="size"><b>Year of
							Manufacturing:</b></label></td>

				<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
							value="${vehicle.yearOfManufacture}" var="formatDate" /><input type="text" id="txt" id="year" name="year"
					value="${formatDate}"></td>

			</tr>

			<tr>
				<td><label for="renev" id="size"><b>Insurance
							Expire Date:</b></label></td>

				<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
							value="${vehicle.insuranceExpiryDate}" var="formatDate" /><input type="text" id="txt" id="renev" name="vehirenewal"
					value="${formatDate}"></td>

			</tr>

			<tr>

				<td><label for="last" id="size"><b>Last Service
							Date:</b></label></td>

				<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
							value="${vehicle.lastServicedDate}" var="formatDate" /><input type="text" id="txt" id="last" name="lastdate"
					value="${formatDate}"></td>

			</tr>

			<tr>

				<td><label for="next" id="size"><b>Next Service
							Date:</b></label></td>

				<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
							value="${vehicle.serviceDueDate}" var="formatDate" /><input type="text" id="txt" id="next" name="nextservice"
					value="${formatDate}"></td>

			</tr>


			<tr>

				<td><label for="next" id="size"><b>Next Available
							Date:</b></label></td>

				<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
							value="${vehicle.nextAvailableDate}" var="formatDate" /><input type="text" id="txt" id="next" name="nextavailable"
					value="${formatDate}"></td>

			</tr>

			<tr>

				<td></td>

				<td><br /> <br /> <input type="submit" id="size"
					value="UPDATE" class="button"></td>

				<td><br /> <br /> <input type="reset" id="size" value="CLEAR"
					class="button"></td>

			</tr>

		</table>

	</form>
	<footer> Copyrights@2019 </footer>
</body>
</html>
