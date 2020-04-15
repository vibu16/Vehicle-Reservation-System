<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER APPROVAL</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
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
	<table class="center">

		<div>

			<h1 id="h1-center">APPROVAL</h1>
			<h1 id="h1-center">${app}</h1>
			<h1 id="h1-center">${rej}</h1>
			<tr>
				<th id="size">Id</th>

				<th id="size">First Name</th>

				<th id="size">Last Name</th>

				<th id="size">Age</th>

				<th id="size">Gender</th>

				<th id="size">Contact</th>

				<th id="size">Branch</th>
			</tr>

			<c:forEach var="list" items="${pending}">
				<tr>
					<td id="size">${list.id}</td>
					<td id="size">${list.firstName}</td>
					<td id="size">${list.lastName}</td>
					<td id="size">${list.age}</td>
					<td id="size">${list.gender }</td>
					<td id="size">${list.contactNumber}</td>
					<td id="size">${list.branch}</td>
					<td><a name="Approve" class="button" id="size"
						href="AdminApprove?id=${list.id}">APPROVE</a> <a name="Reject"
						class="button" id="size" href="AdminReject?id=${list.id}">REJECT</a></td>

				</tr>
			</c:forEach>
	</table>



</body>
</html>
