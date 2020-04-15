<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BOOKING VEHICLE CONFIRMATION</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<script type="text/javascript" src="./js/script.js"></script>

<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>

$(document).ready(function() {
	$('input[type="radio"]').click(function() {
		var inputValue = $(this).attr("value");
		var targetBox = $("." + inputValue);
		$(".card").not(targetBox).hide();
		$(targetBox).show();
	});
});

</script>
</head>
<body class="body">
	<header class="header"> <img src="./image/logo1.jpg" />
	<h2>
		<span id="head">VEHICLE RESERVATION SYSTEM</span>
	</h2>
	<a id="nav-menu" class="button1" href="Logout.jsp"><b>LOGOUT</b></a> <a
		id="nav-menu" class="button1" href="User_Home.jsp"><b>HOME</b></a> </header>

	<h1 id="h1-center">ENTER THE BELOW CREDENTIALS</h1>
	<h1 id="h1-center">${add}</h1>
	<form name="bookingform" method="post" action="BookVehicle" onsubmit="return bookVehicle(this)" >
<script>$('#pick_date').datepicker({ dateFormat: 'dd-mm-yy' }).val();</script>
		<table class="center">

			<tr>

				<td><label for="name" id="size"><b>User id:</b></label></td>

				<td><input type="text" id="txt"
					placeholder="Enter the  User Id" name="id" id="name"
					value="<%=session.getAttribute("id")%>" readonly="readonly"
					autocomplete="off" /></td>

			</tr>
			<tr>

				<td><label for="name" id="size"><b>Vehicle Name:</b></label></td>

				<td><input type="text" id="txt" name="vehiname" id="name"
					value="${vehicle.name}" readonly="readonly" autocomplete="off"></td>

			</tr>
			<tr>

				<td><label for="num" id="size"><b>Vehicle Number:</b></label></td>

				<td><input type="text" id="txt" id="num" name="vehinum"
					id="txt" value="${vehicle.vehicleNumber}" readonly="readonly"
					autocomplete="off"></td>

			</tr>
			<tr>

				<td><label for="name" id="size"><b>From:<b></label></td>
		
				<td><input type="date" class="textbox" id="pick_date"
					name="from" onchange="cal()" autocomplete="off"  /></td>
					

				<td><label for="name" id="size"><b>To:<b></label><input
					type="date" class="textbox" id="drop_date" name="to"
					onchange="cal()" autocomplete="off" /></td>
			</tr>
			<tr>

				<td><label for="noDays" id="size"><b>No Of Days:<b></label></td>

				<td><input type="text" class="textbox" id="numdays2"
					name="numdays"  onkeyup="add()"  autocomplete="off"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td><label for="price" id="size"><b>Price per Day:</b></label></td>

				<td><input type="text" id="price" name="vehiprice"
					value="${vehicle.price}" onkeyup="add()" readonly="readonly"
					autocomplete="off"></td>

			</tr>
			<tr>

				<td><label for="name" id="size"><b>Promo Codes:<b></label></td>

				<td><input type="text" id="txt"
					placeholder="Enter the Promo Codes" id="name" name="code"
					autocomplete="off" /></td>

			</tr>
			<tr>

				<td><label for="name" id="size"><b>Amount:<b></label></td>

				<td><input type="text"  placeholder="Amount" name="amount"
					id="amount" autocomplete="off" readonly="readonly"/></td>
					<td><br /> <br /> <input type="button" id="size"
					class="button" value="Get Amount" onclick="add()" ></td>

			</tr>
			<tr>
				<td><label id="size"><b>Book Type:</b></label></td>

				<td><label><input type="radio" name="bookType"  
						id="size" value="card" checked onkeyup="cardCheck()"><b>Card</b> </label> <label><input
						type="radio" name="bookType" id="size" value="cash"><b>Cash</b> </label></td>

			</tr>

			
			<tr>
				<td><label class="card" id="size"><b>Card Number:</b></label></td>

				<td><input type="text"  id="txt" placeholder="Enter Valid Card Number"
					name="num" class="card"/></td>

			</tr>

			<tr>

				<td><label class="card" id="size"><b>Expiry Date:</b></label></td>

				<td><input type="text" id="txt" placeholder="MM-YYYY" name="date" class="card"/></td>

			</tr>

			<tr>

				<td><label class="card" id="size"><b>CVV Code:</b></label></td>

				<td><input type="text" id="txt" placeholder="CVV" name="code" class="card"/></td>
			</tr>
			
			
			<tr>
				<td><br /> <br /> <input type="submit" id="size"
					class="button" value="SUBMIT"></td>
				<td><br /> <br /> <input type="reset" id="size"
					class="button" value="CLEAR"></td>
					
					
			</tr>

		</table>

	</form>

	<footer> Copyrights@2019 </footer>

</body>
</html>
