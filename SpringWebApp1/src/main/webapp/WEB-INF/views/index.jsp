<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
	welcome to index page <br>
	<% 
		String name = (String)request.getAttribute("name1");
		List<String> list = (List<String>)request.getAttribute("friends");
	%>
	
	<%= name %> <br>
	
	<%
		for(String s: list){
	%>
		<%= s %>
	<%		
		}
	%>
</body>
</html>