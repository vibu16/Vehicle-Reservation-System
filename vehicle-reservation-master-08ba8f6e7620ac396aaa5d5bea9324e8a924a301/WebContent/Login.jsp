<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<title>LOGIN</title>

<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<script type="text/javascript" src="./js/script.js"></script>

</head>

<body class="body">

	<header> <img src="./image/logo1.jpg" /> <span id="head">VEHICLE
		RESERVATION SYSTEM</span>
	<div></div>

	</header>

	<form name="form" method="post" action="LoginServlet"
		onsubmit="validate()">

		<table class="center">

			<div>

				<h1 id="h1-center">LOGIN PAGE</h1>
				<h1 id="h1-center">${msg}</h1>

				<tr>

					<td><label id="size"><b>ID:</b></label></td>

					<td><input type="text" id="size" placeholder="Enter Id"
						name="id" id="txt" autocomplete="off" /></td>

				</tr>

				<tr>

					<td><label id="size"><b>Password:</b></label></td>

					<td><input type="password" id="size"
						placeholder="Enter Password" name="password" id="txt"
						autocomplete="off" /></td>

				</tr>
				<tr>

					<td><input type="submit" name="submit" class="button"
						id="size" value="LOGIN"></input></td>



					<td><input type="reset" class="button" id="size" value="CLEAR"></input></td>

				</tr>

				<tr>

					<td><a id="size" id="register" href="Register.jsp">REGISTER</a></td>

				</tr>

			</div>

		</table>

	</form>

	<footer> Copyrights@2019 </footer>

</body>

</html>