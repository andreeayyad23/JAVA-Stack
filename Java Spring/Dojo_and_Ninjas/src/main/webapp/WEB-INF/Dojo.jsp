<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container mt-5">
    <h1>New Dojo</h1>
    <form:form action="/dojos" method="post" modelAttribute="dojo" class="form-horizontal">
        <div class="form-group">
            <form:label path="name" class="control-label">Name:</form:label>
            <form:errors path="name" cssClass="text-danger"/>
            <form:input path="name" class="form-control"/>
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
