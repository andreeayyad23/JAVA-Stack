<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Omikuji Form</title>
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <h1 class="text-center mb-4">Here's Your Omikuji!</h1>
                <div class="card bg-light mb-3">
                    <div class="card-body">
                        <p class="card-text">
                            In <c:out value="${num}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roommate, <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${living}"/>, you will have good luck. Also, <c:out value="${desc}"/>
                        </p>
                    </div>
                </div>
                <div class="text-center">
                    <a class="btn btn-outline-primary" href="/omikuji">Go Back</a>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz4fnFO9gybA1r7Y0iMe8Q4K4lzSA6z57Q9P3SyNsPE4xv9Hu/aIyYbc50" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-KE6v3BLsqCrnO4LpAdo4zsdnngefw5TIQ0zx0zT0HkoEv5bCuV8Gkfu7WPUh4JjI" crossorigin="anonymous"></script>
</body>
</html>
