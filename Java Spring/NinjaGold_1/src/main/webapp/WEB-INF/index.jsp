
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ninja Gold</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

    <div class="container">

        <div class="num-gold">
            <label for="gold" class="gold_num">Your Gold:</label>
            <input type="hidden" name="gold"/><c:out value="${gold }"/>
        </div>

        <div class="boxes">
            <div class="boxes-side">
                <h3>Farm</h3>
                <h5>(earns 10-20 gold)</h5>
                <form action="/farm" method="post">
                    <input type="hidden" />
                    <button type="submit">Find Gold!</button>
                </form>
            </div>

            <div class="boxes-side">
                <h3>Cave</h3>
                <h5>(earns 5-10 gold)</h5>
                <form action="/cave" method="post">
                    <input type="hidden" />
                    <button type="submit">Find Gold!</button>
                </form>
            </div>

            <div class="boxes-side">
                <h3>House</h3>
                <h5>(earns 2-5 gold)</h5>
                <form action="/house" method="post">
                    <input type="hidden" />
                    <button type="submit">Find Gold!</button>
                </form>
            </div>

            <div class="boxes-side">
                <h3>Quest</h3>
                <h5>(earns/ takes 0-50 gold)</h5>
                <form action="/casino" method="post">
                    <input type="hidden" />
                    <button type="submit">Find Gold!</button>
            </div>
        </div>

        <div class="activities">
            <p>Activities:</p>
            <div name=" activity" class="active">
            <c:forEach var="i" items="${activites}">
            	<c:choose>
            		<c:when test="${i.contains('failed')}">
                    	<p style="color: rgb(255, 255, 255);"><c:out value="${i}"></c:out></p>
                    </c:when>
                    <c:otherwise>
                    <p style="color: #f1e10f;"><c:out value="${i}"></c:out></p>
                    </c:otherwise>
                </c:choose>
             </c:forEach>
            </div>
        </div>
        <br>
            <form action="/reset" method="post">
            <a href="/reset" role ="button">reset</a>
            </form>
    </div>
</body>
</html>