<%-- 
    Document   : editnote
    Created on : Feb 1, 2023, 3:14:31 PM
    Author     : khanhhoanguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note Page</title>
    </head>
    <body>
        <p><h1>Simple Note Keeper</h1></p>
        <p><h2>Edit Note</h2></p>

        <form method="post" action="note">
            Title: 
            <input type="text" name="title" value="<c:out value="${note.title}"/>" /><br />
            Contents: 
            <textarea name="contents"rows="5" cols="25"><c:out value="${note.contents}"/></textarea><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
