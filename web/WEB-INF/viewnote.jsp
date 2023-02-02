<%-- 
    Document   : viewnote
    Created on : Feb 1, 2023, 3:14:17 PM
    Author     : khanhhoanguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note Page</title>
    </head>
    <body>
        <p><h1>Simple Note Keeper</h1></p>
        <p><h2>View Note</h2></p>
        <p><strong>Title:</strong><c:out value="${note.title}"/></p>
        <p><strong>Contents:</strong><br><c:out value="${note.contents}"/></p>
        <a href="note?edit">edit</a> 
        
    </body>
</html>
