<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="./css/style.css" rel="Stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Vehicle</title>
</head>
<body class="body">
       <header class="header"> <img src="./image/logo1.jpg" /> <span
              id="head">VEHICLE RESERVATION SYSTEM</span>
              <a id="nav-menu" href="Logout.jsp">Logout</a>
                <a id="nav-menu" href="Admin_Home.jsp">Home</a>
       </header>
                  
       <h1 id="h1-center">Edit Vehicle</h1>
       <form name="form" method="post" action="update?vehicleNumber=${vehicle.vehicleNumber}" onsubmit="validate()">
				<div>
				<b>
              <table class="center">

                     <tr>

                           <td class=""><label for="name">Vehicle Name:</label></td>

                           <td><input type="text" id="name" name="vehiname"></td>

                     </tr>

                     <tr>

                           <td class=""><label for="mod">Vehicle Model:</label></td>

                           <td><input type="text" id="mod" name="vehimod"></td>

                     </tr>

                     <tr>

                           <td class=""><label for="num">Vehicle Number:</label></td>

                           <td><input type="text" id="num" name="vehinum"></td>

                     </tr>
                     <tr>

                           <td class=""><label for="num">Color:</label></td>

                           <td><input type="text" id="num" name="vehicolor"></td>

                     </tr>
                     <tr>

                           <td class=""><label for="num">Branch:</label></td>

                           <td><input type="text" id="num" name="vehibranch"></td>

                     </tr>
                     

                     <tr>

                           <td class=""><label for="year">Year of Manufacturing:</label></td>

                           <td><input type="text" id="year" name="year"></td>

                     </tr>

                     <tr>

                           <td class=""><label for="renev">Insurance Renewal Date:</label></td>

                           <td><input type="text" id="renev" name="vehirenewal"></td>

                     </tr>

                     <tr>

                           <td class=""><label for="last">Last Service Date:</label></td>

                           <td><input type="text" id="last" name="lastdate"></td>

                     </tr>

                     <tr>

                           <td class=""><label for="next">Next Service Date:</label></td>

                           <td><input type="text" id="next" name="nextservice"></td>

                     </tr>

                     <tr>

                           <td class=""><label for="status">Status:</label></td>

                           <td><select name="cars">

                                         <option value="avail">Available</option>

                                         <option value="not">Not Available</option>

                           </select></td>

                     </tr>
                     <tr><td><br />
                           <br /> <input type="submit" value="Update"></td>

                           <td><br />
                           <br />
                           <input type="reset" value="Clear"></td>

                     </tr>

              </table>
              </b>
              </div>

       </form>
       <footer> Copyrights@2019 </footer>
</body>

</html>