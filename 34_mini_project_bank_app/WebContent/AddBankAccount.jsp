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
                         <button name="action" value="home" type="submit" class="btn btn-outline-secondary">Home</button>
                    </li>
                    <li class="nav-item ms-2 d-none d-md-inline">
                        <a class="btn btn-outline-secondary" href="Login.jsp">Logout</a>
                    </li>

                </ul>
                </form>
            </div>
        </div>
        
    </nav>
    <section id="addCustomer" class="bg-light mt-1 p-1">
        
            <div class="container-lg">

                <div class="text-center">
                    <h2>Add Bank Account</h2>
                    <p class="lead">New Bank Account to add? Fill out this form...</p>
                </div>
                <div class="row justify-content-center my-5">
                    <div class="col-lg-6">
                            <form action="CustomerIDController" method="post">
                                <label for="subject" class="form-label">Search by Customer ID</label>
                                <div class="mb-4 input-group">
                                    <span class="input-group-text">
                                        <i class="bi bi-list-ol"></i>
                                    </span>
                                     <input type="number" name="idSelected" id="name" class="form-control" placeholder="e.g. 1,2,3..." />
                                </div>
                                <div class="mb-4 text-center">
                                    <button type="submit" class="btn btn-outline-primary">Search</button>
                                </div>
                            </form>
                            <form action="AccountGenerationController" method="post">
                            <div class="mb-4 mt-5 form-floating">
                                <div class="bg-white p-4 border rounded">
                                <c:if test="${empty sessionScope.selectedCustomer}">
                                <p class="text-muted mb-0">Enter correct customer id<br>account details..<br></p>
                                </c:if>
                                 <c:if test="${not empty sessionScope.selectedCustomer}">
                                   
                                    <p class="text-muted mb-0">customer id: ${selectedCustomer.getCustomerID()}</p>
                                    <p class="text-muted mb-0">first name: ${selectedCustomer.getFirstName()}</p>
                                    <p class="text-muted mb-0">last name: ${selectedCustomer.getLastName()}</p>
                                    <p class="text-muted mb-0">email: ${selectedCustomer.getEmail()}</p>
                                   
									  
                </c:if>
                                </div>
                            </div>
                            <label for="subject" class="form-label">Enter Account ID</label>
                                <div class="mb-4 input-group">
                                    <span class="input-group-text">
                                        <i class="bi bi-list-ol"></i>
                                    </span>
                                     <input type="number" name="accountID" id="name" class="form-control" placeholder="e.g. 1,2,3,etc..." />
                                </div>
                            <label for="subject" class="form-label">Enter Balance</label>
                                <div class="mb-4 input-group">
                                    <span class="input-group-text">
                                        <i class="bi bi-list-ol"></i>
                                    </span>
                                     <input type="number" name="balance" id="name" class="form-control" placeholder="e.g. 1000,2000,etc..." />
                                </div>
                            <div class="mb-4 text-center">
                                <button type="submit" class="btn btn-primary">Generate account number</button>
                                <p>**NOTE** This will create a new bank account.</p>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>

</html>