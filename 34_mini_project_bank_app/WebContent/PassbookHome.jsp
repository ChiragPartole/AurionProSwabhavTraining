<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>

<body>
<nav class="navbar navbar-expand-md navbar-light pt-2 pb-1">
        <div class="container-xxl">
            <!-- navbar brand / title -->
            
                <span class="text-secondary fw-bold fs-4">
                    <i class="bi bi-bank2"></i>
                    Bank App
                </span>
          
            <!-- toggle button for mobile nav -->
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#main-nav"
                aria-controls="main-nav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <!-- navbar links -->
            <div class="collapse navbar-collapse justify-content-end align-center" id="main-nav">
               <form action="NavbarController" method="get">
                <ul class="navbar-nav">
                    <li class="nav-item ms-2 d-none d-md-inline">
                         <button name="action" value="homeUser" type="submit" class="btn btn-outline-secondary">Home</button>
                    </li>
                    <li class="nav-item ms-2 d-none d-md-inline">
                        <a class="btn btn-outline-secondary" href="Login.jsp">Logout</a>
                    </li>

                </ul>
                </form>
            </div>
        </div>
        
    </nav>
    <section id="admin" class="bg-light mt-1 p-1">
        <div class="container-lg">
            <div class="text-center">
                <h2>View Passbook</h2>
                <p class="lead text-muted">Here you can view all of your transactions.</p>

<form action="PassbookController" method="get">
<button type="submit" class="btn btn-outline-primary btn-lg mt-3">VIEW</button>
</form>

         
            </div>

    
        </div>
    </section>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>

</html>