<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="HELLO"/>  

<br><c:import url="NewFile.jsp"></c:import>

<br><c:set var="number" scope="session" value ="${5}"></c:set>
<c:out value="${number}"></c:out>

<br>
<c:if test="${number%2==0}">
<c:out value="EVEN"></c:out>
</c:if>


<c:set var="number2" scope="session" value ="${5}"></c:set>
<c:choose> 
    <c:when test="${number2 >= 0}">  
       <c:out value="number is positive "></c:out>
    </c:when>   
    <c:otherwise>  
       <c:out value="number is negative "></c:out>
    </c:otherwise>  
</c:choose>  
  
</body>
</html>