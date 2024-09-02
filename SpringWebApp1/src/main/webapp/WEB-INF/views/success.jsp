<%@page import="spring.mvc.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>data</title>
</head>
<body>
	this is data page. <br>
	<%
		/* String email = (String)request.getAttribute("email");
		String name = (String)request.getAttribute("username");
		String password = (String)request.getAttribute("password"); */
		User user = (User)request.getAttribute("user");
	%>
	
	<%-- <%= email %><br>
	<%= name %><br>
	<%= password %> --%>
	
	<%= user.getEmail() %><br>
	<%= user.getUsername() %><br>
	<%= user.getPassword() %>
	
</body>
</html>