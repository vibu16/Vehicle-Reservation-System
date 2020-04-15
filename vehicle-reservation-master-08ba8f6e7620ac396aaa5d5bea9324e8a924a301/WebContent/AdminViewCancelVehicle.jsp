<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN VIEW CANCELLED VEHICLES</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<script type="text/javascript" src="./js/script.js"></script>
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
	<h1 id="h1-center">CANCELLED VEHICLES</h1>
	<form name="form" method="post" action="AdminViewCancelDetails">

		<table class="center">
			<div>
				<tr>
					<th id="size"><b>User Id</b></th>
					<th id="size"><b>Vehicle Number</b></th>
					<th id="size"><b>Price</b></th>
					<th id="size"><b>Refund</b></th>
				</tr>
				<c:forEach items="${viewVehicles }" var="list">
					<tr>
						<td id="size">${list.userId}</td>
						<td id="size">${list.vehicleNumber}</td>
						<td id="size">${list.price}</td>
						<td id="size">${list.refund}</td>
					</tr>
				</c:forEach>
		</table>

	</form>

	<footer> Copyrights@2019 </footer>


</body>
</html>
