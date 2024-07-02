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
    <h1 class="mt-4">Save Travels</h1>
    
    <form:form action="/create" method="post" modelAttribute="expense" class="mb-4">
        <div class="mb-3">
            <form:label path="expense_name" class="form-label">Expense Name:</form:label>
            <form:input path="expense_name" class="form-control"/>
            <form:errors path="expense_name" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="vendor" class="form-label">Vendor:</form:label>
            <form:input path="vendor" class="form-control"/>
            <form:errors path="vendor" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="amount" class="form-label">Amount:</form:label>
            <form:input path="amount" class="form-control"/>
            <form:errors path="amount" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="description" class="form-label">Description:</form:label>
            <form:textarea path="description" class="form-control"/>
            <form:errors path="description" class="text-danger"/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
    
    <h2 class="mt-5">Expenses List</h2>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Expense Name</th>
                <th>Vendor</th>
                <th>Amount</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="expense" items="${expenses}">
            <tr>
                <td><a href="/expenses/${expense.id}/show"><c:out value="${expense.expense_name}" /></a></td>
                <td><c:out value="${expense.vendor}" /></td>
                <td><c:out value="${expense.amount}" /></td>
                <td>
                    <a href="/expenses/${expense.id}/edit" class="btn btn-sm btn-primary">Edit</a>
                    <form action="/expenses/${expense.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <button type="submit" class="btn btn-sm btn-danger">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

