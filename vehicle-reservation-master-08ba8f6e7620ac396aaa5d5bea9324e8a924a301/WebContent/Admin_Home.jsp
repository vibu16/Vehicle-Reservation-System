<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<title>Admin Home</title>

<link href="./css/style.css" rel="Stylesheet" type="text/css" />

</head>

<body>

	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		href="Logout.jsp">Logout</a> <a id="nav-menu" href="Admin_Home.jsp">Home</a>
	</header>
	
	<marquee>
		<h4>DISCOUNT OF 20% ON BOOKING TWO VEHICLES || DISCOUNT OF 50% ON
			BOOKING FIVE VEHICLES.</h4>
	</marquee>
<<<<<<< HEAD
	<aside>  </aside>
	<section> <article>
	<nav>
	<ul>
		<li><a href="AddVehicle.jsp">Add Vehicle</a></li>
		<br>
		<li><a href="ShowPendingServlet">Approve Login</a></li>
		<br>
		<li><a href="AdminViewVehicles.jsp">View Vehicle</a></li>
	</ul>
	</nav>
=======

	<section id="bgcolor"> <article>
	<div class="headerhome">
                                                <p>
                                                <input type="submit" onClick="location.href='AddVehicle.jsp'" value="Add Vehicle" />
                                                <p>
                                                <input type="submit" onClick="location.href='ShowPendingListServlet'" value="Approve Login" />
                                                <p>
                                                <input type="submit" onClick="location.href='#'" value="View Vehicle" />
       </div>
>>>>>>> 5d26f199f709f7d2627db4bbe2ac7b9ec34af443
	</article> </section>


	<footer> Copyrights@2019 </footer>

</body>
</html>
