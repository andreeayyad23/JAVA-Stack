<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container mt-5">
	<h1>New Ninja</h1>
	<form:form action="/ninjas" method="post" modelAttribute="ninja" class="form-horizontal">
		<div class="form-group">
			<form:label path="dojo" class="control-label">Dojo:</form:label>
			<form:select path="dojo" class="form-control">
				<c:forEach var="oneDojo" items="${dojo}">
				<form:option value="${oneDojo.id}">${oneDojo.name}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<form:label path="firstName" class="control-label">First Name:</form:label>
			<form:input path="firstName" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="lastName" class="control-label">Last Name:</form:label>
			<form:input path="lastName" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="age" class="control-label">Age:</form:label>
			<form:input path="age" class="form-control"/>
		</div>
		<div class="form-group">
			<input type="submit" value="Create" class="btn btn-primary"/>
		</div>
	</form:form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
