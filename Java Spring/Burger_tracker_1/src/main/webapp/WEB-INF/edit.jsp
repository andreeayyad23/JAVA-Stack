<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Burger</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1 class="my-4">Edit Burger</h1>
    <form:form action="/burger/${burger.id}" method="post" modelAttribute="burger">
        <input type="hidden" name="_method" value="put">
        <div class="mb-3">
            <form:label path="burgerName" class="form-label">Burger Name</form:label>
            <form:errors path="burgerName" cssClass="text-danger"/>
            <form:input path="burgerName" class="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="resturentName" class="form-label">Restaurant Name</form:label>
            <form:errors path="resturentName" cssClass="text-danger"/>
            <form:input path="resturentName" class="form-control" />
        </div>
        <div class="mb-3">
            <form:label path="note" class="form-label">Note</form:label>
            <form:errors path="note" cssClass="text-danger"/>
            <form:input path="note" class="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="rating" class="form-label">Rating</form:label>
            <form:errors path="rating" cssClass="text-danger"/>
            <form:input type="number" path="rating" class="form-control"/>
        </div>    
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
</body>
</html>

