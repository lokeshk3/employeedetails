<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function goBack() {
  window.history.back();
}
</script>
<body>
Employee saved successfully.
<br>

			 <% Employee emp = (Employee) request.getAttribute("emp"); %> 
					
					<h1 align="center">Employee Details</h1>				
					<table align="center">
					
	                <tr><td>ID : <%= emp.getId() %></td></tr>
	                                <tr><td><br></td></tr>
	                
	                <tr><td>Name : <%= emp.getName() %></td></tr>
	                                <tr><td><br></td></tr>
	                
	                <tr><td>Date of Birth : <%= emp.getDob() %></td></tr>
	                                <tr><td><br></td></tr>
	                
	                <tr><td>Date of Joining : <%= emp.getDoj() %></td></tr>
	                                <tr><td><br></td></tr>
	                
	                <tr><td>Designation : <%= emp.getDesignation() %></td></tr>
	                                <tr><td><br></td></tr>
	                <tr><td><button onclick="goBack()">Back</button></td></tr>	
	                                
				</table>

</body>
</html>