<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN VIEW BOOKED VEHICLE</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<script type="text/javascript" src="./js/script.js"></script>
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
	<h1 id="h1-center">BOOKED VEHICLES</h1>
	<h1 id="h1-center">${app}</h1>
	<form name="form" method="post"
		action="CustomerViewBookedVehicleServlet">
		<table class="center">
			<tr>

				<td><label for="name" id="size"><b>User id:<b></label></td>

				<td><input type="text" id="size" id="txt" id="name"
					placeholder="Enter the  User Id" name="id"
					value="<%=session.getAttribute("id")%>" readonly="readonly"
					autocomplete="off" /></td>

				<td><input type="submit" id="size" class="button" value="SHOW"></td>
			</tr>
		</table>
		<c:if test="${not empty viewVehicles}">
			<table class="center">
				<div>
					<tr>
						<th id="size"><b>Vehicle Number</b></th>
						<th id="size"><b>From</b></th>
						<th id="size"><b>To</b></th>
						<th id="size"><b>Number of Days</b></th>
						<th id="size"><b>Promo Codes</b></th>
						<th id="size"><b>Price</b></th>

					</tr>
					<c:forEach items="${viewVehicles }" var="list">
						<tr>
							<td id="size">${list.vehicleNumber}</td>
							<td id="size">${list.startDate}</td>
							<td id="size">${list.endDate}</td>
							<td id="size">${list.noOfDays}</td>
							<td id="size">${list.promocodes}</td>
							<td id="size">${list.price}</td>

							<td><a name="Delete" id="size"
								href="CustomerCancelVehicleServlet?vehinum=${list.vehicleNumber}"
								class="button" action="CustomerCancelVehicleServlet">CANCEL</a></td>
						</tr>
					</c:forEach>
			</table>
		</c:if>
	</form>

	<footer> Copyrights@2019 </footer>


</body>
</html>
