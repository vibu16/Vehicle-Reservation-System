<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./css/style.css" rel="Stylesheet" type="text/css" />

<title>User View Vehicle</title>
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		href="Logout.jsp">Logout</a> <a id="nav-menu" href="Admin_Home.jsp">Home</a>
	</header>
	<aside> <nav>
	<ul>
		<li><a href="search.jsp">Search</a></li>
	</ul>
	</nav> </aside>
<table class="center">
		<div>
		     <h1 id="h1-center">User Vehicle Details</h1>
			
			<tr>
				<th>VehicleName</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>VehicleModel</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>VehicleNo</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Color</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>SeatingCapacity</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
			</tr>

			<c:forEach items="${viewVehicles }" var="vehicle">
				<tr>
					<td >${vehicle.vehicleName}</td>
					<td>${vehicle.vehicleModel}</td>
					<td>${vehicle.vehicleNumber}</td>
					<td>${vehicle.color}</td>
					<td>${vehicle.seatingCapacity}</td>
					<td><a name="book"
						href="book?vehicleNumber=${vehicle.vehicleNumber}">Book</a>
					</td>
				</tr>
			</c:forEach>
			</div>
		</table>
	
	<footer> Copyrights@2019 </footer>
</body>
</html>