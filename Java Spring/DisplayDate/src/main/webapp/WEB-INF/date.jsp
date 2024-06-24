<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!-- JSTL library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">	
	<link rel="stylesheet" type="text/css" href="style.css">
    <script type="text/javascript" src="date.js"></script>
	<title>Date</title>
</head>
<body>
	<div id="container">
	<h1 class="date"><c:out value="${date}" /></h1>
	</div>
</body>
</html>