
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create course</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
    <h1 class="mt-4">Create a Course</h1>
           <div class="mb-3">
    </div>
    
    <form:form action="/create" method="post" modelAttribute="yoga" class="mb-4">
        <div class="mb-3">
            <form:label path="name" class="form-label">name</form:label>
            <form:input path="name" class="form-control"/>
            <form:errors path="name" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="weekday" class="form-label">Day a Week:</form:label>
            <form:input path="weekday" class="form-control"/>
            <form:errors path="weekday" class="text-danger"/>
        </div>
     
        <div class="form-group m-3 col-3">
				<form:label path="price">Drop in Price</form:label>
				<form:errors class="text-danger" path="price"/>
				<form:input type="number" min="0.0" path="price" class="form-control"/>
			</div>

			
			<div class="mb-3">
            <form:label path="description" class="form-label">Description:</form:label>
            <form:input path="description" class="form-control"/>
            <form:errors path="description" class="text-danger"/>
        </div>
        
        <div class="mb-3">
            <form:hidden path="user" value=" ${userId}" ></form:hidden>
        </div>
     
        <button type="submit" class="btn btn-primary">Submit</button>
        <a class="m-3" href="/classes"><input type=button value="Cancel"></a>
    </form:form>
    </div>
</body>
</html>
   
