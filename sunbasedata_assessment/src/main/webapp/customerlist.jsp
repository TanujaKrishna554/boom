<%@page import="sunbasedata.dto.Data_dto"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
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
<form action="" method="post">
<fieldset>
<legend><b>Customer List</b></legend>
<button id="but2"><a href="customerdetails.html">Add Customer</a></button>
 <%List<Data_dto> da=(List<Data_dto>)request.getAttribute("objects");%>

		
			<center><h2><u>Customer list</u></h2></center>
			<center><table border="1px">
			
				<tr>
				<th id="t">
			Uuid
			
			</th>
					<th id="t">
						First Name
					</th>
					
					<th id="t">
						Last Name
					</th>
					
					<th id="t">
						Address
					</th>
					<th id="t">
						state
					</th>
						<th id="t">
						Street
					</th>
					<th id="t">
						City
					</th>
					<th id="t">
						Email
					</th>
					<th id="t">
						phone
					</th>
					
					<th id="t">
						Delete
					</th>
					<th id="t">
						Edit
					</th>
				</tr>
				<%for(Data_dto e:da){%>
				<tr>
				<td><%=e.getUuid() %></td>
				<td><%=e.getFirst_name() %></td>
				<td><%=e.getLast_name() %></td>
				<td><%=e.getAddress() %></td>
				<td><%=e.getState() %></td>
				<td><%=e.getStreet() %></td>
				<td><%=e.getCity() %></td>
				<td><%=e.getEmail()%></td>
				<td><%=e.getPhone() %></td>
				<td><a href="dc?uuid=<%=e.getUuid() %>">Delete</a></td>
				<td><a href="updatecustomer.jsp?uuid=<%=e.getUuid()%>&&firstname=<%=e.getFirst_name()%>&&lastname=<%=e.getLast_name()%>&&address=<%=e.getAddress()%>&&state=<%=e.getState() %>&&city=<%=e.getCity()%>&&street=<%=e.getStreet()%>&&emailid=<%=e.getEmail()%>&&phone=<%=e.getPhone()%>">Edit</a></td>
				
				</tr>
				<%} %>
				
			
		
		
		
	



				
				
				
			</table></center>
			</fieldset>
			</form>



</body>
</html>