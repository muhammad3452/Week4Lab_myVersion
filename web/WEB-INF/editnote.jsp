 <%-- 
    Document   : editnote
    Created on : 9-Oct-2022, 2:29:22 PM
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
        <h2>Edit Note</h2>
        <form method="post" action="note">
             Title:<input type="text" name="title" value="This is the title"><br>
            Contents: <textarea name="content">Contents go here</textarea><br>
            <input type="submit" name="save" value="Save">
        </form> 
       
    </body>
</html>
