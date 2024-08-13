<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <form action="CustomerController" method="post">
            <div class="container-lg">

                <div class="text-center">
                    <h2>ADD NEW CUSTOMER</h2>
                    <p class="lead">New customers to add? Fill out this form to add them..</p>
                </div>
                <div class="row justify-content-center my-5">
                    <div class="col-lg-6">

                        <form>
                            <label for="customerID" class="form-label">Customer ID:</label>
                            <div class="mb-4 input-group">
                                <span class="input-group-text">
                                    <i class="bi bi-person-vcard"></i>
                                </span>
                                <input type="number" name="customerID" id="customerID" class="form-control"
                                    placeholder="e.g. 1" />
                                <!-- tooltip -->
                                <span class="input-group-text">
                                    <span class="tt" data-bs-placement="bottom" title="Enter ID of the customer...">
                                        <i class="bi bi-question-circle text-muted"></i>
                                    </span>
                                </span>
                            </div>
                            <label for="firstname" class="form-label">First Name:</label>
                            <div class="mb-4 input-group">
                                <span class="input-group-text">
                                    <i class="bi bi-person-fill text-secondary"></i>
                                </span>
                                <input type="text" name="firstname" id="firstname" class="form-control"
                                    placeholder="e.g. Mario" />
                                <!-- tooltip -->
                                <span class="input-group-text">
                                    <span class="tt" data-bs-placement="bottom"
                                        title="Enter first name of the customer...">
                                        <i class="bi bi-question-circle text-muted"></i>
                                    </span>
                                </span>
                            </div>
                            <label for="lastname" class="form-label">Last Name:</label>
                            <div class="mb-4 input-group">
                                <span class="input-group-text">
                                    <i class="bi bi-person-fill text-secondary"></i>
                                </span>
                                <input type="text" name="lastname" class="form-control" placeholder="e.g. Doe" />
                                <!-- tooltip -->
                                <span class="input-group-text">
                                    <span class="tt" data-bs-placement="bottom"
                                        title="Enter last name of the customer...">
                                        <i class="bi bi-question-circle text-muted"></i>
                                    </span>
                                </span>
                            </div>
                            <label for="email" class="form-label">Email address:</label>
                            <div class="input-group mb-4">
                                <span class="input-group-text">
                                    <i class="bi bi-envelope-fill text-secondary"></i>
                                </span>
                                <input type="text" name="email" class="form-control"
                                    placeholder="e.g. mario@example.com" />
                                <!-- tooltip -->
                                <span class="input-group-text">
                                    <span class="tt" data-bs-placement="bottom"
                                        title="Enter an email address of the customer.">
                                        <i class="bi bi-question-circle text-muted"></i>
                                    </span>
                                </span>
                            </div>

                            <div class="mb-4">
                                <label for="password" class="form-label">Password:</label>
                                <div class="input-group">
                                    <span class="input-group-text">
                                        <i class="bi bi-lock-fill text-secondary"></i>
                                    </span>
                                    <input type="password" name="password" class="form-control" placeholder="Password">
                                </div>
                            </div>

                            <div class="mb-4 text-center">

                                <button type="submit" class="btn btn-primary">Submit</button>


                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </form>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    <script>
        const tooltips = document.querySelectorAll('.tt')
        tooltips.forEach(t => {
            new bootstrap.Tooltip(t)
        })
    </script>
</body>

</html>