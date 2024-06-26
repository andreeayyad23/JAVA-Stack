<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Current visit</title>
</head>
<body>
    <div class="container">
        <div class="mt-4 text-center mb-4">
            <h4 class="text-dark" >You have visited <a href="/your_server">http://your_server</a> <c:out value="${count}"/>Time</h4>
        </div>
        <div class="d-flex justify-content-around">
            <a type="button" class="btn btn-outline-success" href="/your_server/increment2"> Increment the counter by 2</a>
            <a type="button" class="btn btn-outline-warning" href="/your_server">Test another visit?</a>
            <a type="button" class="btn btn-outline-secondary" href="/your_server/back_to_zero">Back to zero</a> 
        </div>
    </div>
</body>
</html>