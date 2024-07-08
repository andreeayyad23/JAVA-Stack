
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View course</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <div class="mb-3">
        <a href="/classes" class="btn btn-outline-danger">Back To Dashboard</a>
    </div>
 
                <h5 class="card-subtitle mb-2 text-muted">
                    <c:out value="${yoga.name}" /> with <c:out value="${yoga.user.userName}" />.
                </h5>
                <p class="card-text">
                    Day: <c:out value="${yoga.weekday}" />
                </p>
                <p>Cost:$ <c:out value="${yoga.price}" /></p>
                <hr>
                <p class="card-text">
                    <c:out value="${yoga.description}" />
                </p>
            </div>
      
         

</body>
</html>
