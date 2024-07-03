<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Read Share</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <div class="mb-3">
        <a href="/home" class="btn btn-outline-danger">Back to the Shelf!</a>
    </div>
        <div class="card mb-4">
            <div class="card-header">
                <h2 class="card-title"><c:out value="${books.title}" /></h2>
            </div>
            <div class="card-body">
                <h5 class="card-subtitle mb-2 text-muted">
                    <c:out value="${books.user.userName}" /> read <c:out value="${books.title}" /> by <c:out value="${books.author_name}" />.
                </h5>
                <p class="card-text">
                    Here are <c:out value="${books.user.userName}" />'s thoughts:
                </p>
                <hr>
                <p class="card-text">
                    <c:out value="${books.thoughts}" />
                </p>
            </div>
        </div>
        <div>
        <form action="/delete/${books.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <button type="submit" class="btn btn-sm btn-danger">Delete</button>
                    </form>
                        <a href="/books/${books.id}/edit"><button type="submit" class="btn btn-sm btn-danger">Edit</button></a>
         </div>
                    
</div>
</body>
</html>
