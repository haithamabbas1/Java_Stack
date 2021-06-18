<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><c:out value="${error}"/></p>
<h1>What is the code?</h1>
<form action="/thecode" method="POST">
<input type="text" name="thecode"><br><br>
<button type="submit"><h1>Try Code</h1></button>
</form>

</body>
</html>