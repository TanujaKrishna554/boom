<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="login.css">
</head>

<body>
<form action="updatecust" method="post">
<legend>Update</legend>
<fieldset>
<center><h2>
				<u>Customer Details</u></h2></center>
				<center><tr><td><input id="in" type="number" name="uuid" placeholder="uuid" value="<%=request.getParameter("uuid") %>"readonly="readonly"></td></tr></center>
				<center><table>
					
				
					<tr>
						<td>
				<input id="in" type="text" name="firstname" placeholder="First Name" value="<%=request.getParameter("firstname") %>">
				<input id="in" type="text" name="lastname"  placeholder="Last Name" value="<%=request.getParameter("lastname") %>">
				</td>
				</tr>
				
				<tr>
					<td>
				
				<input id="in"  type="text" name="street" placeholder="Street" value="<%=request.getParameter("street") %>">
				<input id="in"  type="text" name="address" placeholder="Address" value="<%=request.getParameter("address") %>">
				
				
				</td>
				</tr>
				<tr>
					<td>
				<input id="in"  type="text" name="city" placeholder="City" value="<%=request.getParameter("city") %>">
				<input id="in"  type="text" name="state" placeholder="State" value="<%=request.getParameter("state") %>">
				</td>
				</tr>
				
				<tr>
					<td>
				<input id="in"  type="email" name="emailid" placeholder="Email" value="<%=request.getParameter("emailid") %>">
				<input id="in"  type="number" name="Phone" placeholder="Phone" value="<%=request.getParameter("phone") %>">
				
				</td>
				</tr>
				<tr>
				<td>
				<center><button id="but2">submit</button></center>
				</td>
				</tr>
				
				</table></center>
				</fieldset>
				</form>
			                                                                                                                
			                                                                                                                
			                                                                                                                
				

</body>
</html>