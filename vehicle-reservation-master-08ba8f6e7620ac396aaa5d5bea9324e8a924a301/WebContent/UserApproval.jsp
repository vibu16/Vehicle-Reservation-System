<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
</head>
<body >
 <header>

       <img src="./image/logo1.jpg" /><h2>
       <span id="head" >VEHICLE RESERVATION SYSTEM</span></h2><div></div>
	   
    </header>
    <div class="approveImg divContent">
    <span class="approveText">User Approval !</span>
	
	<table class="center tablealign">
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr>
	<th class="fieldContent">
	Member Id
	</th>
	<th class="fieldContent">
	First Name
	</th>
	<th class="fieldContent">
	Gender
	</th>
	<th class="fieldContent">
	Contact Details
	</th>
	<th class="fieldContent">
	Type
	</th>
	</tr>
	
	<c:forEach items="${userList }" var="user"> 
			<tr>
				<td class="left"><c:out value="${user.id}"></c:out></td>
				<td class="left"><c:out value="${user.firstName}"></c:out></td>
				<td class="right"><c:out value="Rs. ${user.gender}"></c:out></td>
				<td class="center"><c:out value="${user.contactNumber}"></c:out></td>
				<td class="center"><c:out value="${user.userType}"></c:out></td>
				<td class="center">
					<a class="approveLink" href = "">Accept</a>
				</td>
				<td class="center">
					<a class="approveLink" href = "">Decline</a>
				</td>
			</tr>
			</c:forEach>
			</table>
			</div>
	<footer>
Copyrights@2019
</footer> 

</body>

</html>

</body>
</html>