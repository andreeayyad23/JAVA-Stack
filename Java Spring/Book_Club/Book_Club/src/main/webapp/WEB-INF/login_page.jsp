<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login and Registration</title>
    
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
     
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="text-center m-3">
		<h1 class="welcome">Welcome</h1>
		<h6 class="error">${mustlogin}</h6>
	</div>
	
	<div class="row m-5 d-flex justify-content-center">
		<div class="col-md-4">
			<div class="card p-5  border-dark ">
				<h2 class="card-title"> Register</h2>
				<div class="card-body">
					<form:form action="/register" method="post" modelAttribute="newUser">
						<p class="error"><form:errors path="userName"></form:errors></p>
						<p class="error"><form:errors path="email"></form:errors></p>
						<p class="error"><form:errors path="password"></form:errors></p>
						<p class="error"><form:errors path="confirmPassword"></form:errors></p>
					 	<table class="table">
					 		<tr>
					 			<td><form:label path="userName">User Name:</form:label></td>
					 			<td> <form:input path="userName"/></td>
					 		</tr>
					 		<tr>
					 			<td><form:label path="email">Email:</form:label></td>
					 			<td> <form:input path="email"/></td>
					 		</tr>
					 		<tr>
					 			<td><form:label path="password">Password</form:label></td>
					 			<td> <form:input type="password" path="password"/></td>
					 		</tr>
					 		<tr>
					 			<td><form:label path="confirmPassword">Confirm PW:</form:label></td>
					 			<td> <form:input type="password" path="confirmPassword"/></td>
					 		</tr>
					 		<tr>
					 			<td></td>
					 			<td> <button type="submit" class="btn btn-warning">Register</button> </td>
					 		</tr>
					 	</table>
					</form:form>
				</div>
			</div>
		</div>
		
		<div class="col-md-4 ">
			<div class="card p-5 h-100  border-dark">
				<h2 class="card-title"> Login</h2>
				<div class="card-body">
					<form:form action="/login" method="post" modelAttribute="newLogin">
					<p  class="error"><form:errors path="email"></form:errors></p>
					<p  class="error"><form:errors path="password"></form:errors></p>
					 	<table class="table">
					 		<tr>
					 			<td><form:label path="email">Email:</form:label></td>
					 			<td> <form:input path="email"/></td>
					 		</tr>
					 		<tr>
					 			<td><form:label path="password">Password</form:label></td>
					 			<td> <form:input type="password" path="password"/></td>
					 		</tr>
					 		<tr>
					 			<td></td>
					 			<td> <button type="submit" class="btn btn-warning">Login</button> </td>
					 		</tr>
					 	</table>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>