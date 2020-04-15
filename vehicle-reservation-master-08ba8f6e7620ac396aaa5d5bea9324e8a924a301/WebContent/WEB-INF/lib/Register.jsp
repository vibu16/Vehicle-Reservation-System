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

	<header> <img src="./image/logo1.jpg" />
	<h2>
		<span id="head">VEHICLE RESERVATION SYSTEM</span>
	</h2>
	<div></div>

	</header>

	<form name="form" method="post" action="LoginRegisterServlet" onsubmit="validate()">

		<table class="center">

			<div>

				<h1 id="h1-center">Registration Page</h1>

				<tr>

					<td><label>USERNMAE:</label></td>

					<td><input type="text" placeholder="Enter Id" name="id" /></td>

				</tr>

				<tr>

					<td><label>First Name:</label></td>

					<td><input type="text" placeholder="Enter First name"
						name="firstName" /></td>

				</tr>

				<tr>

					<td><label>Last Name:</label></td>

					<td><input type="text" placeholder="Enter Last name"
						name="lastName" /></td>

				</tr>

				<tr>

					<td><label>Password:</label></td>

					<td><input type="text" placeholder="Enter Password"
						name="password" /></td>

				</tr>
				<tr>

					<td><label>Confirm Password:</label></td>

					<td><input type="text" placeholder="Enter Confirm Password"
						name="password" /></td>

				</tr>
				<tr>

					<td><label>Age:</label></td>

					<td><input type="text" placeholder="Enter Age" name="age" /></td>

				</tr>

				<tr>

					<td><label>Gender:</label></td>

					<td><select name="gender">
							<option value="male">Male</option>
							<option value="female">Female</option>
					</select></td>

				</tr>

				<tr>

					<td><label>Contact Number:</label></td>

					<td><input type="text" placeholder="Enter Contact Number"
						name="number" /></td>

				</tr>

				<tr>

					<td><label>Email Id:</label></td>

					<td><input type="text" placeholder="Enter Email Id"
						name="emailId" /></td>

				</tr>
				<tr>
					<td>Security Question:</td>
					<td><select>
							<option value="1">What is your first school's name?</option>
							<option value="2">What is your first best friend's name?</option>
							<option value="3">What is your favorite car's name?</option>
							<option value="4">What is your first pet's name?</option>
							<option value="5">What is your favorite holiday spot?</option>
					</select></td>
				</tr>
				<tr>
				<td></td>
				<td><input type="text" placeholder="Enter Answer"
						name="answer" /></td>
				</tr>
				<tr>
					<td><label>User Type:</label></td>

					<td><select name="usertype">
							<option value="admin">Admin</option>
							<option value="user">User</option>
					</select></td>
				</tr>
				<td><label>Branch:</label></td>

				<td><input type="text" placeholder="Enter Branch" name="branch" /></td>

				</tr>

				<tr>

					<td><input type="submit" name="Register" value="Register"></input></td>
					
					<td><input type="reset" value="Clear"></input></td>

				</tr>
			</div>

		</table>

	</form>

	<footer> Copyrights@2019 </footer>



</body>

</html>