<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./css/style.css" rel="Stylesheet" type="text/css" />

<title>SORT</title>
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		class="button1" href="Logout.jsp"><b>LOGOUT</b></a> <a id="nav-menu"
		class="button1" href="Customer_Home.jsp"><b>HOME</b></a> </header>
	<marquee>
		<h4>10% discount on paying through SBI || Apply coupon promo05
			for 5% discount.</h4>
	</marquee>

	<form name="form" action="SearchVehicle">
		<table class="center">
			<tr>
				<td></td>
				<td><a href="search.jsp" class="button" id="size">SEARCH</a></td>
			</tr>
			<tr>
				<td id="size"><b>Extended Sort :</b></td>

				<td><select name="sort" id="txt" autocomplete="off">
						<option value="nameA-Z" id="size">Sort by Name (A to Z)</option>
						<option value="nameZ-A" id="size">Sort by Name (Z to A)</option>
						<option value="typeA-Z" id="size">Sort By Type(A to Z)</option>
						<option value="typeZ-A" id="size">Sort By Type(Z to A)</option>
						<option value="colorA-Z" id="size">Sort By Color(A to Z)</option>
						<option value="colorZ-A" id="size">Sort By Color(Z to A)</option>
						<option value="capacityHigh-Low" id="size">Sort By
							Capacity(High to Low)</option>
						<option value="capacityLow-High" id="size">Sort By
							Capacity(Low to High)</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" class="button" name="submit" id="size"
					value="SUBMIT"></input></td>
			</tr>
		</table>
	</form>

	<c:if test="${not empty vehicleList }">
		<table class="center">
			<tr>
				<th id="size">Vehicle Number</th>
				<th id="size">Vehicle Name</th>
				<th id="size" id="size">Vehicle Color</th>
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