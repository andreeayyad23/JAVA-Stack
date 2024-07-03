<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Travels</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
    <h1 class="mt-4">Change Your Enter</h1>
        <div class="mb-3">
        <a href="/home" class="btn btn-outline-danger">Back to the Shelf!</a>
    </div>
    
    <form:form action="/books/${book.id}" method="post" modelAttribute="book" class="mb-4">
     <input type="hidden" name="_method" value="put">
    
        <div class="mb-3">
            <form:label path="title" class="form-label">Title</form:label>
            <form:input path="title" class="form-control"/>
            <form:errors path="title" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="author_name" class="form-label">Author:</form:label>
            <form:input path="author_name" class="form-control"/>
            <form:errors path="author_name" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="thoughts" class="form-label">MyThoughts:</form:label>
            <form:input path="thoughts" class="form-control"/>
            <form:errors path="thoughts" class="text-danger"/>
        </div>
        
        <div class="mb-3">
            <form:hidden path="user" value=" ${userId}" ></form:hidden>
        </div>
     
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
    </div>
</body>
</html>
   