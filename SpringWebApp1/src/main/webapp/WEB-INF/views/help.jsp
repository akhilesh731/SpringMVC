<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>
	this is help page<br>
	
	<% 
		String name = (String)request.getAttribute("name1"); 
		LocalDateTime dateTime = (LocalDateTime)request.getAttribute("time");
	%>
	
	<%= name %><br>
	<%= dateTime %>
</body>
</html>