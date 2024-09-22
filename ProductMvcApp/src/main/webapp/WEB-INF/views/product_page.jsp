<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>	
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

<title>product</title>
</head>
<body>
<div class="container mt-5">
	<div class="row">
		<div class="column-md-6 mb-3">
			<h3>Enter Product details here!</h3>
			<form action="handle-product" method="post">
					<div class="form-group mb-3">
						<label for="name">Product Name</label> 
						<input type="text" class="form-control" id="name" name="name">
					</div>
					<div class="form-group mb-3">
						<label for="name">Product Description</label>
						<textarea rows="5" class="form-control" id="description" name="description"></textarea>
					</div>
					<div class="form-group">
						<label for="price">Product Price</label> 
						<input type="text" class="form-control" id="price" name="price">
					</div>
					<div class="container text-center">
					<button type="submit" class="btn btn-primary mt-2">Add</button>
					</div>
				</form>
		</div>
	</div>
</div>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</body>
</html>