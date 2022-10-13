<%-- 
    Document   : viewnote
    Created on : 9-Oct-2022, 2:29:08 PM
    Author     : muham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p><b>Title:</b> ${note.title}</p>
        <b>Contents:</b>
        <p>${note.contents}</p>
   
        <br><a href="note?edit">Edit</a> 
    </body>
</html>
