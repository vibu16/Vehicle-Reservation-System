<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<title>REGISTRATION</title>

<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<script src="./js/script.js" type="text/javascript" ></script>

</head>
	<head>
	
	</head>
	<body>
	<header>
                <img src="./logo.png" /><span id="head" >Vehicle Reservation System</span>
                <a id="nav-menu" href="logout.html">Logout</a><a id="nav-menu" href="Home.html">Home</a>
            </header>

	<form name="addVehicle" method="post" action=""
		onsubmit="return ValidateAddVehicle();">
	<table>

	<tr>
	<td><label for="name">Vehicle Name</label></td>
	<td><input type="text" id="name" name="vehiname"></td>
	</tr>
	<tr>
	<td><label for="mod">Vehicle Model</label></td>
	<td><input type="text" id="mod" name="vehimod"></td>
	</tr>
	<tr>
	<td><label for="num">Vehicle Number</label></td>
	<td><input type="text" id="num" name="vehinum"></td>
	</tr>
	<tr>
	<td><label for="year">Year of Manufacturing</label></td>
	<td><input type="text" id="year" name="year"></td>
	</tr>
	<tr>
	<td><label for="renev">Insurance Renewal Date</label></td>
	<td><input type="text" id="renev" name="vehirenewal"></td>
	</tr>
	<tr>
	<td><label for="last">Last Service Date</label></td>
	<td><input type="text" id="last" name="lastdate"></td>
	</tr>
	<tr>
	<td><label for="next">Next Service Date</label></td>
	<td><input type="text" id="next" name="nextservice"></td>
	</tr>
	<tr>
	<td><label for="status">Status</label></td>
	<td><select name="cars">
    <option value="avail">Available</option>
    <option value="not">Not Available</option>
  </select></td>
	</tr>
	
	<tr>
	<td></td>
	<td><br/><br/>
	<input type="submit" value="Add"></td>
	<td><br/><br/><input type="reset" value="clear"></td>
	</tr>
</table>
	</form>


	<footer> Copyrights@2019 </footer>
</body>
</html>