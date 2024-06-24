<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Reciept</title>
</head>
<body>
<table>
    <tr>
    <td>
        <h1>Cutomer Name:</h1> 
    </td>
    <td>
        <c:out value="${name}"/>
    </td>
    </tr>
    <tr>
        <td>
            <h2>Item name:</h2>
        </td>
        <td>
            <c:out value="${itemName}"/>
        </td>
    </tr>
    <tr>
        <td>
            <h2>Price</h2>
           </td> 
           <td>
            <c:out value="${price}"/>
        </td>
    </tr>
    <tr>
         <td>
        <h2>Description</h2>
         </td>
         <td>
        <c:out value="${description}"/>
    </td>
    </tr>
    <tr>
        <td>
            <h2>Vendor:</h2>
        </td>
        <td>
            <c:out value="${vendor}"/>
        </td>
        
    </tr>
   

</table>

</body>
</html>