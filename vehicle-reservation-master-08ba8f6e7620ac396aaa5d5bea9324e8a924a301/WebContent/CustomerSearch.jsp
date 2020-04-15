<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CUSTOMER SEARCH</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		class="button1" href="Logout.jsp"><b>LOGOUT</b></a> <a id="nav-menu"
		class="button1" href="User_Home.jsp"><b>HOME</b></a> </header>
	<marquee>
		<h4>DISCOUNT OF 20% ON BOOKING TWO VEHICLES || DISCOUNT OF 50% ON
			BOOKING FIVE VEHICLES.</h4>
	</marquee>

	<h1 id="h1-center">Search</h1>
	<form name="form" method="post" action="CustomerSearchVehicle"
		onsubmit="validate()">
		<table class="center">
			<tr>
				<td id="size"><b>Extended Search :</b></td>
				<td><select name="searchType" id="size" id="search"
					autocomplete="off">
						<option value="byName">Vehicle Name</option>
						<option value="byNumber">Vehicle Number</option>
						<option value="byType">Vehicle Type</option>
						<option value="byColor">Vehicle Color</option>
						<option value="byCapacity">Seating Capacity</option>
				</select></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="text" id="size" name="Search"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" class="button" id="size"
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
					<td id="size">${vehicleItem.nextAvailableDate}</td>
					<td id="size">${vehicleItem.price}</td>
				</tr>

			</c:forEach>
		</table>
	</c:if>

	<footer> Copyrights@2019 </footer>
</body>
</html>