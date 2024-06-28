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
                <h1 class="text-center mb-4">Send an Omikuji!</h1>
                <form action="/send" method="post">
                    <div class="mb-3">
                        <label for="num" class="form-label">Pick any number from 5 to 25</label>
                        <input type="number" name="num" min="5" max="25" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label for="city" class="form-label">Enter the name of any city</label>
                        <input type="text" name="city" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label for="person" class="form-label">Enter the name of any real person</label>
                        <input type="text" name="person" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label for="hobby" class="form-label">Enter a professional endeavor or hobby</label>
                        <input type="text" name="hobby" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label for="living" class="form-label">Enter any type of living thing</label>
                        <input type="text" name="living" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label for="desc" class="form-label">Say something nice to someone</label>
                        <textarea name="desc" class="form-control" rows="3" required></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary w-100">Send</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz4fnFO9gybA1r7Y0iMe8Q4K4lzSA6z57Q9P3SyNsPE4xv9Hu/aIyYbc50" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-KE6v3BLsqCrnO4LpAdo4zsdnngefw5TIQ0zx0zT0HkoEv5bCuV8Gkfu7WPUh4JjI" crossorigin="anonymous"></script>
</body>
</html>
