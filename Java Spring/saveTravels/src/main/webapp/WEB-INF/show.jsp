<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Expense Details</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <div class="container">
        <div class="card mt-5">
            <div class="card-body">
                <h3 class="card-title">Expense Name: <c:out value="${expense.expense_name}"/></h3>
                <div class="card-text">
                    <p>Vendor: <c:out value="${expense.vendor}"/></p>
                    <p>Amount: <c:out value="${expense.amount}"/></p>
                    <p>Description: <c:out value="${expense.description}"/></p>
                </div>
            </div>
        </div>
        <div class="text-center mt-3">
            <a href="/expenses" class="btn btn-primary">Go Back</a>
        </div>
    </div>
</body>
</html>
