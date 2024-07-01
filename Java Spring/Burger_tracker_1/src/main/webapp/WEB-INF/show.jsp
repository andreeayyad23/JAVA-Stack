<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Burger Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Burger Details</h1>
        <p>ID: ${burger.id}</p>
        <p>Name: ${burger.burgerName}</p>
        <p>ResturentName: ${burger.resturentName}</p>
        <p>Rating: ${burger.rating}</p>
        <a href="/burger/new" class="btn btn-primary">Back to List</a>
    </div>
</body>
</html>
