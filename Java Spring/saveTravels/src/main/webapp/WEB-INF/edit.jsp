<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1>Edit Expense</h1>
    <form action="/expenses/${expense.id}" method="post" modelAttribute="expense">
        <input type="hidden" name="_method" value="put">
        <div class="mb-3">
            <label for="expenseName" class="form-label">Expense Name:</label>
            <input type="text" id="expense_name" name=expense_name class="form-control" value="${expense.expense_name}">
        </div>
        <div class="mb-3">
            <label for="vendor" class="form-label">Vendor:</label>
            <input type="text" id="vendor" name="vendor" class="form-control" value="${expense.vendor}">
        </div>
        <div class="mb-3">
            <label for="amount" class="form-label">Amount:</label>
            <input type="text" id="amount" name="amount" class="form-control" value="${expense.amount}">
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Description:</label>
            <textarea id="description" name="description" class="form-control">${expense.description}</textarea>
        </div>
        <button type="submit" class="btn btn-primary">Save Changes</button>
    </form>
</div>
</body>
</html>
