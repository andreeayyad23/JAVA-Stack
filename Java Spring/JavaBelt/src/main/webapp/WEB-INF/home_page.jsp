
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
     
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class=" d-flex justify-content-between m-5">
		<h1 class="welcome2">${user.userName}.</h1>
		<div>
			<a href="/logout" class="btn btn-outline-danger"> Logout</a>
		</div>
	</div>
		<h3>Course Scheduale</h3>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Class Name</th>
                <th>Instructor</th>
                <th>Weekend</th>
                <th>Price</th>
                
            </tr>
        </thead>
        <tbody>
        <c:forEach var="yoga" items="${yogas}">
            <tr>
                <td><a href="/classes/${yoga.id}"><c:out value="${yoga.name}" /></a><c:if test="${yoga.user.id == userId}">
 
                        <a href="/classes/${yoga.id}/edit"><button type="submit" class="btn btn-sm btn-danger">Edit</button></a>
                  </c:if></td>
                <td><c:out value="${yoga.user.userName}" /></td>
                <td><c:out value="${yoga.weekday}" /></td>
                <td>$ <c:out value="${yoga.price}" /></td>
                
            </tr>
        </c:forEach>
        </tbody>
    </table>
<p><a href="/classes/new" class="btn btn-danger">+new course</a></p>
	

</body>
</html>
