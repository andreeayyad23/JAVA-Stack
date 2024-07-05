<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Category Page</title>
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/css/bootstrap.min.css' />">
    <link rel="stylesheet" href="<c:url value='/css/main.css' />">
    <script src="<c:url value='/webjars/bootstrap/js/bootstrap.bundle.min.js' />"></script>
    <script src="<c:url value='/js/app.js' />"></script>
</head>
<body>
<div class="container mt-4">
    <h1 class="display-4"><c:out value="${category.name}" /></h1>
    <a href="/" class="btn btn-primary mb-3">Home</a>
    <hr>
    <h2>Products:</h2>
    <ul class="list-group mb-4">
        <c:forEach items="${category.products}" var="product">
            <li class="list-group-item"><h3><c:out value="${product.name}"/></h3></li>
        </c:forEach>
    </ul>
    <hr>
    <h2>Add a Product</h2>
    <form action="/categories/${category.id}" method="POST">
        <div class="form-group mb-3">
            <label for="product" class="form-label" style="font-size: 20px;">Product:</label>
            <select name="product" id="product" class="form-select form-select-lg">
                <c:forEach items="${products}" var="product">
                    <option value="${product.id}"><c:out value="${product.name}"/></option>
                </c:forEach>
            </select>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-success btn-lg">Add</button>
        </div>
    </form>
</div>
</body>
</html>
