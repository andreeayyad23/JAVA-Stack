<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container mt-4">
    <h1 class="display-4">Home Page</h1>
    <div class="mb-3">
        <a href="/categories/new" class="btn btn-primary">New Category</a>
        <a href="/products/new" class="btn btn-primary">New Product</a>
    </div>
    <hr>
    <table class="table table-striped">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Categories</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${categories}" var="category">
                <tr>
                    <td><a href="/categories/${category.id}"><c:out value="${category.name}" /></a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <table class="table table-striped">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Products</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><a href="/products/${product.id}"><c:out value="${product.name}" /></a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
