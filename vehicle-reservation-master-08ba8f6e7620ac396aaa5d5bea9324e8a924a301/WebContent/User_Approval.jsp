<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<<<<<<< HEAD
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
=======
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Approval</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		href="Logout.jsp">Logout</a> <a id="nav-menu" href="Admin_Home.jsp">Home</a>
	</header>
	<aside> <nav>
	<ul>
<<<<<<< HEAD
		<li><a href="AddVehicleServlet">Add Vehicle</a></li>
		<br>
		<br>
		<br>
		<br>
		<br>
		<li><a href="AdminViewVehicles.jsp">Admin View Vehicle</a></li>
		<br>
		<br>
		<br>
		<br>
		<br>
		<li><a href="search.jsp">Search Vehicle</a></li>
=======
		<li><a href="AddVehicle.jsp">Add Vehicle</a></li>
		<br>

		<br>
		<li><a href="AdminViewVehicles.jsp">Admin View Vehicle</a></li>
		<br>

		<br>
		<li><a href="CustomerViewVehicles.jsp">Customer View Vehicle</a></li>
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
	</ul>
	</nav> </aside>


<<<<<<< HEAD
	
	<table class="center">

              <div>

                     <h1 id="h1-center">Approval</h1>
                     <tr>
                           <th class="fieldContent">Id</th>

                           <th class="fieldContent">First Name</th>

                           <th class="fieldContent">Last Name</th>

                           <th class="fieldContent">Age</th>

                           <th class="fieldContent">Gender</th>

                           <th class="fieldContent">Contact</th>
                           <th class="fieldContent">Branch</th>
                     </tr>

                     <c:forEach var="list" items="${pending}">
                           <tr>
                                  <td>${list.id}</td>
                                  <td>${list.firstName}</td>
                                  <td>${list.lastName}</td>
                                  <td>${list.age}</td>
                                  <td>${list.gender }</td>
                                  <td>${list.contactNumber}</td>
                                  <td>${list.branch}</td>
                                  <td><a name="Approve" href="AproveAdmin?id=${list.status}">Approve</a>
                                         <a name="Reject" href="AproveAdmin?id=${list.id}">Reject</a></td>

                           </tr>
                     </c:forEach>
       </table>

	
	<footer> Copyrights@2019 </footer>

</body>
</html>
=======
	<section> <article>

<form name="form" method="post" action="ApproveMemberServlet" onsubmit="validate()">
	<table class="center">

		<div>

			<h1 id="h1-center">Approval</h1>
			<tr>
				<th class="fieldContent">Id</th>

				<th class="fieldContent">First Name</th>

				<th class="fieldContent">Last Name</th>

				<th class="fieldContent">Age</th>

				<th class="fieldContent">Gender</th>

				<th class="fieldContent">Contact</th>
				<th class="fieldContent">Branch</th>
				<th class="fieldContent">Status</th>
			</tr>

			<c:forEach var="list" items="${pending}">
				<tr>
					<td>${list.id}</td>
					<td>${list.firstName}</td>
					<td>${list.lastName}</td>
					<td>${list.age}</td>
					<td>${list.gender }</td>
					<td>${list.contactNumber}</td>
					<td>${list.branch}</td>
					<td><input type="radio" id="ys" name="ysno" value="approve"
						<c:if test="${list.status eq 'true'}"></c:if>><label
						for="ys">Approve </label> <label for="no"><input
							type="radio" id="no" name="ysno" value="rejected"
							<c:if test="${list.status eq 'false'}"></c:if>>Rejected</label></td>

				</tr>
			</c:forEach>
	</table>
</form>
	</article> </section>

</body>
</html>
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
