<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" 
	integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" 
	crossorigin="anonymous" 
	referrerpolicy="no-referrer"/>
<title>index</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="column-md-12">
				<h3 class="text-center">Welcome to Product Page!</h3>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${products}" var="product">
						<tr>
							<th scope="row">${product.id}</th>
							<td>${product.name}</td>
							<td>${product.description}</td>
							<td class="font-weight-bold">&#8377; ${product.price}</td>
							<td><a href="delete/${product.id}"><i class="fa-solid fa-trash"></i></a>&nbsp;
							<a style="width: 10px;" href="update/${product.id}">Edit</a>
							</td>
						</tr>
					</c:forEach>	
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-product" class="btn btn-outline-success">Add Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>