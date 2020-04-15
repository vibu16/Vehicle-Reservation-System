<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<title>REGISTRATION</title>

<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<script type="text/javascript" src="./js/script.js"></script>

</head>

<body class="body">

	<header> <img src="./image/logo1.jpg" /> <span id="head">VEHICLE
		RESERVATION SYSTEM</span>
	<div></div>

	</header>

	<form name="form" method="post" action="RegisterServlet"
		onsubmit="return register(this);">

		<table class="center">

			<div>

				<h1 id="h1-center">REGISTRATION PAGE</h1>

				<tr>

					<td><label id="size"><b>UserId:</b></label></td>

					<td><input type="text" id="txt" placeholder="Enter Id"
						name="id" autocomplete="off" /></td>

				</tr>

				<tr>

					<td><label id="size"><b>First Name:</b></label></td>

					<td><input type="text" id="txt" placeholder="Enter First name"
						name="firstName" autocomplete="off" /></td>

				</tr>

				<tr>

					<td><label id="size"><b>Last Name:</b></label></td>

					<td><input type="text" id="txt" placeholder="Enter Last name"
						name="lastName" autocomplete="off" /></td>

				</tr>

				<tr>

					<td><label id="size"><b>Password:</b></label></td>

					<td><input type="password" id="txt"
						placeholder="Enter Password" name="password" autocomplete="off" /></td>

				</tr>
				<tr>

					<td><label id="size"><b>Confirm Password:</b></label></td>

					<td><input type="password" id="txt"
						placeholder="Enter Confirm Password" name="cpassword"
						autocomplete="off" /></td>

				</tr>
				<tr>

					<td><label id="size"><b>Age:</b></label></td>

					<td><input type="text" id="txt" placeholder="Enter Age"
						name="age" autocomplete="off" /></td>

				</tr>

				<tr>

					<td><label id="size"><b>Gender:</b></label></td>

					<td><select name="gender" id="txt" autocomplete="off">
							<option value="male">Male</option>
							<option value="female">Female</option>
					</select></td>

				</tr>

				<tr>

					<td><label id="size"><b>Contact Number:</b></label></td>

					<td><input type="text" id="txt"
						placeholder="Enter Contact Number" name="number"
						autocomplete="off" /></td>

				</tr>

				<tr>

					<td><label id="size"><b>Email Id:</b></label></td>

					<td><input type="text" id="txt" placeholder="Enter Email Id"
						name="emailId" autocomplete="off" /></td>

				</tr>
				<tr>
					<td><label id="size"><b>User Type:</b></label></td>

					<td><select name="usertype" id="txt">
							<option value="admin">Admin</option>
							<option value="user">User</option>
					</select></td>
				</tr>
				<th><label id="size"><b>Branch:</b></label></th>
				<td><input type="text" id="txt" placeholder="Enter Branch"
					name="branch" autocomplete="off" /></td>

				</tr>

				<tr>

					<td><input type="submit" class="button" name="Register"
						id="size" value="REGISTER"></input></td>

					<td><input type="reset" class="button" id="size" value="CLEAR"></input></td>

				</tr>
			</div>

		</table>

	</form>

	<footer> Copyrights@2019 </footer>



</body>

</html>