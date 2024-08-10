<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<%@ include file ="Insert.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b>This is jsp demo</b>
<%-- This is comment tag --%>
<%

Date date = new Date();
out.print(date);
%>
<%-- This is declaration tag --%>
<%! String message = "HELLO"; %>

<br>
<%-- This is expression tag --%>
<h1><%=  message  %></h1>


<br><br>
<form method="get" action="Insert.jsp">  
<input type = "text" name = "name">  
<input type = "submit" value = "submit"><br/> 
</form>  

<form method="get" action="google.jsp">  
<h1>go to google.com</h1>  
<input type = "submit" value = "submit"><br/> 
</form> 

</body>
</html>