<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Name: <c:out value="${name}"/></h2>
<h2>Dojo Location: <c:out value="${dojolocation}"/></h2>
<h2>Favorite language: <c:out value="${favlang}"/></h2>
<h2>Any comments: <c:out value="${comments}"/></h2>
</body>
</html>