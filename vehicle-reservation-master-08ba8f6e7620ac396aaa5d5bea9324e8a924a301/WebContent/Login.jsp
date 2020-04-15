<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<title>Login</title>

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
	<form name="form" method="post" action="LoginServlet"
		onsubmit="validate()">

		<table class="center">

			<div>

				<h1 id="h1-center">Login Page</h1>
				<h1 id="h1-center">${msg}</h1>

				<tr>

					<td><input type="text" placeholder="Enter Admin Employee Id"
			name="id" /></td>


				</tr>

				<tr>

					<td><label>Password:</label></td>

					<td><input type="password" placeholder="Enter Password"
						name="password" /></td>

				</tr>
				<tr>

					<td><input type="submit" name="submit" value="Login"></input></td>



					<td><input type="reset" value="Clear"></input></td>

				</tr>

				<tr>

					<td><a id="register" href="Register.jsp">Register</a></td>
					<td><a id="register" href="">Forgot Password</a></td>
				</tr>

			</div>

		</table>

	</form>

	<footer> Copyrights@2019 </footer>

</body>

</html>