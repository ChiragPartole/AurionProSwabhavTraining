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
<section id="login" class="bg-light mt-5 p-3">
        <div class="container-lg">
            <div class="text-center">
                <h2>BANKING APP</h2>
                <p class="lead text-muted">WELCOME USER.</p>
                <c:if test="${not empty sessionScope.operationDone}">
                    
                        ${sessionScope.operationDone}
                    
                    <!-- Remove the attribute from session after displaying -->
                    <c:remove var="operationDone" scope="session" />
                </c:if>
               <%
    // Get the session, but don't create a new one if it doesn't exist
    HttpSession session1 = request.getSession(false);

    // Check if the session exists
    if (session1 != null) {
        // Invalidate the session
        session1.invalidate();
        
        // Optionally, you can provide a message or redirect to another page
        
    }
%>
                
            </div>
    <div class="container">
        <div class="row justify-content-center my-5">
            <div class="col-lg-6 form-container">
                <form action="LoginController" method="post">
                    <label for="email" class="form-label">Username:</label>
                        <div class="input-group mb-4">
                            <span class="input-group-text">
                                <i class="bi bi-person-fill text-secondary"></i>
                            </span>
                            <input type="text" name="username" id="email" class="form-control" placeholder="e.g. mario" />
                            <!-- tooltip -->
                            <span class="input-group-text">
                                <span class="tt" data-bs-placement="bottom"
                                    title="Enter your username to login.">
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
                            <input type="password" name="password" id="password" class="form-control" placeholder="Password">
                        </div>
                    </div>

                    <div class="btn-container">
                        <button type="submit" class="btn btn-primary" name="role" value="admin">Login
                            as Admin</button>
                        <button type="submit" class="btn btn-secondary" name="role" value="user">Login
                            as User</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    
    </div>
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