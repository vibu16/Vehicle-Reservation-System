<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN SEARCH</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		class="button1" href="Logout.jsp"><b>LOGOUT</b></a> <a id="nav-menu"
		class="button1" href="Admin_Home.jsp"><b>HOME</b></a> </header>
	<marquee>
		<h4>DISCOUNT OF 20% ON BOOKING TWO VEHICLES || DISCOUNT OF 50% ON
			BOOKING FIVE VEHICLES.</h4>
	</marquee>

	<h1 id="h1-center">SEARCH</h1>
	<form name="form" method="post" action="AdminSearchVehicle"
		onsubmit="validate()">
		<table class="center">
			<tr>
				<td id="size"><b>Extended Search :</b></td>
				<td><select name="searchType" id="size" id="txt" id="search">
						<option value="byName" id="size">Vehicle Name</option>
						<option value="byNumber" id="size">Vehicle Number</option>
						<option value="byType" id="size">Vehicle Type</option>
						<option value="byColor" id="size">Vehicle Color</option>
						<option value="byCapacity" id="size">Seating Capacity</option>
				</select></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="text" id="size" id="txt" name="Search"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" id="size" class="button"
					value="SUBMIT"></td>
			</tr>

		</table>
	</form>
	<c:if test="${not empty vehicleList }">
		<table class="center">
			<tr>
				<th id="size">Vehicle Number</th>
				<th id="size">Vehicle Name</th>
				<th id="size">Vehicle Color</th>
				<th id="size">Vehicle Branch</th>
				<th id="size">Vehicle Type</th>
				<th id="size">Seating Capcity</th>
				<th id="size">Year of Manufacture</th>
				<th id="size">Insurance Expiry Date</th>
				<th id="size">Last service Date</th>
				<th id="size">Service Due Date</th>
				<th id="size">Next Available Date</th>
				<th id="size">Price</th>
			</tr>
			<c:forEach items="${vehicleList }" var="vehicleItem">
				<tr>
					<td id="size">${vehicleItem.vehicleNumber}</td>
					<td id="size">${vehicleItem.name}</td>
					<td id="size">${vehicleItem.color}</td>
					<td id="size">${vehicleItem.branch}</td>
					<td id="size">${vehicleItem.vehicleType}</td>
					<td id="size">${vehicleItem.seatingCapacity}</td>
					<td id="size">${vehicleItem.yearOfManufacture}</td>
					<td id="size">${vehicleItem.insuranceExpiryDate}</td>
					<td id="size">${vehicleItem.lastServicedDate}</td>
					<td id="size">${vehicleItem.serviceDueDate}</td>
					<td id="size">${vehicleItem.nextAvailableDate}</td>

					<td id="size">${vehicleItem.price}</td>
				</tr>

			</c:forEach>
		</table>
	</c:if>

	<footer> Copyrights@2019 </footer>
</body>
</html>