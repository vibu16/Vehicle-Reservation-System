<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" /> <span
		id="head">VEHICLE RESERVATION SYSTEM</span> <a id="nav-menu"
		href="Logout.jsp">Logout</a> <a id="nav-menu" href="Admin_Home.jsp">Home</a>
	</header>
	<marquee>
		<h4>DISCOUNT OF 20% ON BOOKING TWO VEHICLES || DISCOUNT OF 50% ON
			BOOKING FIVE VEHICLES.</h4>
	</marquee>
	<form name="form" method="post" action="SearchServlet"
		onsubmit="validate()">

		<table class="center">

			<div>

				<tr>

					<td><label>Search:</label></td>

					<td><select name="search">
							<option value="name">Search By Name</option>
							<option value="type">Search By Type</option>
							<option value="brand">Search By Brand</option>
							<option value="color">Search By Color</option>
							<option value="capacity">Search By Capacity</option>
					</select></td>

				</tr>
				<br>
				<tr>

					<td><label>Please Enter the Specifications :</label></td>

					<td><input type="text" placeholder="Enter the specifications"
						name="specification" /></td>

				</tr>
			<tr>

				<td><input type="submit" name="submit" value="Submit"></input></td>
			</tr>
			</div>
			</table>
			</form>
			<footer> Copyrights@2019 </footer>

			
</body>
</html>