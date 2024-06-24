<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruit Loops</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

</head>
<body>
	<nav class="navbar bg-body-tertiary">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">Fruity Store</span>
  	</div></nav>
	<table class="table table-striped">
		<tbody>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="oneFruit" items="${fruitsFromController}">
			<tr>
        	<td><c:out value="${oneFruit.name}"></c:out></td>
        	<td><c:out value="${oneFruit.price}"></c:out></td>
			</tr>
    	</c:forEach>
		</tbody>
	</table>
</body>
</html>