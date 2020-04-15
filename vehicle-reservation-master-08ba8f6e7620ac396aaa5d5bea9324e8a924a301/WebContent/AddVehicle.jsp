<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD VEHICLE</title>
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

	<h1 id="h1-center">ADD VEHICLE</h1>
	<h1 id="h1-center">${add}</h1>
	<form name="form" method="post" action="AddVehicleServlet"
		onsubmit="return checkForm(this);">

		<table class="center">

			<tr>

				<td><label for="name" id="size"><b>Vehicle Name:</b></label></td>

				<td><input type="text" id="txt"
					placeholder="Enter the vehicle name" id="name" name="vehiname"
					autocomplete="off"/ ></td>

			</tr>

			<tr>

				<td><label for="mod" id="size"><b>Vehicle Type:</b></label></td>

				<td><input type="text" id="txt"
					placeholder="Enter the vehicle type" id="mod" name="vehimod"
					autocomplete="off"/ ></td>

			</tr>

			<tr>

				<td><label for="num" id="size"><b>Vehicle Number:</b></label></td>

				<td><input type="text" id="txt"
					placeholder="Enter the vehicle number" id="num" name="vehinum"
					autocomplete="off"/ ></td>

			</tr>
			<tr>

				<td><label for="col" id="size"><b>Color:</b></label></td>

				<td><input type="text" id="txt"
					placeholder="Enter the vehicle color" id="col" name="vehicolor"
					autocomplete="off" /></td>

			</tr>
			<tr>

				<td><label for="sc" id="size"><b>Seating Capacity:</b></label></td>
				<td><input type="text" id="txt"
					placeholder="Enter the seating capacity" id="sc" name="vehiseat"
					autocomplete="off" /></td>

			</tr>
			<tr>

				<td><label for="price" id="size"><b>Price per Day:</b></label></td>

				<td><input type="text" id="txt" placeholder="Enter the price "
					id="price" name="vehiprice" autocomplete="off" /></td>

			</tr>
			<tr>

				<td><label for="branch" id="size"><b>Branch:</b></label></td>

				<td><input type="text" id="txt" placeholder="Enter the branch"
					id="branch" name="vehibranch" autocomplete="off" /></td>

			</tr>


			<tr>

				<td><label for="year" id="size"><b>Year of
							Manufacturing:</b></label></td>

				<td><input type="date" id="txt" placeholder="DD/MM/YYYY"
					id="year" name="year" autocomplete="off" /></td>

			</tr>

			<tr>

				<td><label for="renev" id="size"><b>Insurance
							Renewal Date:</b></label></td>

				<td><input type="date" id="txt" placeholder="DD/MM/YYYY"
					id="renev" name="vehirenewal" autocomplete="off" /></td>

			</tr>

			<tr>

				<td><label for="last" id="size"><b>Last Service
							Date:</b></label></td>

				<td><input type="date" id="txt" placeholder="DD/MM/YYYY"
					id="last" name="lastdate" autocomplete="off" /></td>

			</tr>

			<tr>

				<td><label for="next" id="size"><b>Next Service
							Date:</b></label></td>

				<td><input type="date" id="txt" placeholder="DD/MM/YYYY"
					id="next" name="nextservice" autocomplete="off" /></td>

			</tr>
			<tr>

				<td></td>

				<td><br /> <br /> <input type="submit" id="size"
					class="button" value="ADD"></td>

				<td><br /> <br /> <input type="reset" id="size"
					class="button" value="CLEAR"></td>

			</tr>

		</table>

	</form>

	<footer> Copyrights@2019 </footer>
</body>
</html>