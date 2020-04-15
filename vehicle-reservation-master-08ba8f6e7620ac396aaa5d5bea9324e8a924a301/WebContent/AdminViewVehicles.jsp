<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<title>View Vehicle</title>
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		href="Logout.jsp">Logout</a> <a id="nav-menu" href="Admin_Home.jsp">Home</a>
	</header>
	<aside> <nav>
	<ul>
		<li><a href="search.jsp">Search</a></li>
		
		<br>
		<br>
		<li><a href="ShowPendingServlet">Approve Login</a></li>
		<br>
		
		<br>
		
	</ul>
	</nav> </aside>


		<table class="center">
		<div>
		     <h1 id="h1-center">Vehicle Details</h1>
			
			<tr>
				<th>Vehicle Name</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Vehicle Model</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Vehicle No</th>
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
				<th>Branch</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Insurance Date</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Last Service Date</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Service Due</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Status</th>
			</tr>

			<c:forEach items="${viewVehicles }" var="vehicle">
				<tr>
					<td >${vehicle.vehicleName}</td>
					<td>${vehicle.vehicleModel}</td>
					<td>${vehicle.vehicleNumber}</td>
					<td>${vehicle.color}</td>
					<td>${vehicle.branch}</td>
					<td>${vehicle.insuranceDate}</td>
					<td>${vehicle.lastServiceDate}</td>
					<td>${vehicle.serviceDueDate}</td>
					<td>${vehicle.status}</td>
					
					<td><a name="Edit"
						href="edit?vehicleNumber=${vehicle.vehicleNumber}">Edit</a>
					<a name="Delete"
						href="delete?vehicleNumber=${vehicle.vehicleNumber}">Delete</a></td>
				</tr>
			</c:forEach>
			</div>
		</table>
	
	<footer> Copyrights@2019 </footer>

</body>
</html>