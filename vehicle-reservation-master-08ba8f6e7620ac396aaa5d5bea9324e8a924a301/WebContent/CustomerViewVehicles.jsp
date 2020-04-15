<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Vehicle List...</title>
</head>
<body>
<header>

       <img src="./image/logo1.jpg" /><h2>
       <span id="head" >VEHICLE RESERVATION SYSTEM</span></h2><div></div>
	   
    </header>
    <div>
	
	<table>
	<tr>
	<td></td><td></td><td></td><td></td>
	<td>Vehicle Details</td>
	</tr>
	<tr>
	<th>
	Vehicle Name
	</th>
	<th>
	Vehicle Model
	</th>
	<th>
	Vehicle No
	</th>
	<th>
	Color
	</th>
	<th>
	Branch
	</th>
	<th>
	Insurance Date
	</th>
	<th>
	Last Service Date
	</th>
	<th>
	Service Due 
	</th>
	<th>
	Status
	</th>
	</tr>
	
	<c:forEach items="${viewVehicles}" var="vehicle"> 
			<tr>
				<td class="left"><c:out value="${vehicle.vehicleName}"></c:out></td>
				<td class="right"><c:out value="${vehicle.vehicleModel}"></c:out></td>
				<td class="left"><c:out value="${vehicle.vehicleNumber}"></c:out></td>
				<td class="left"><c:out value="${vehicle.color}"></c:out></td>
				<td class="left"><c:out value="${vehicle.branch}"></c:out></td>
				<td class="left"><c:out value="${vehicle.yearOfManufacture}"></c:out></td>				
				<td class="center"><c:out value="${vehicle.insuranceExpiryDate}"></c:out></td>
				<td class="center"><c:out value="${vehicle.lastServicedDate}"></c:out></td>
				<td class="center"><c:out value="${vehicle.serviceDueDate}"></c:out></td>
				<td class="center">
					<a href = "delete?vehicleNumber=${vehicle.vehicleNumber}">Delete</a>
				</td>
			</tr>
			</c:forEach>
			</table>
			</div>
	<footer>
Copyrights@2019
</footer> 

</body>
</html>