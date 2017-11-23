<%-- 
    Document   : index
    Created on : 05-Oct-2017, 11:23:14
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Image Upload</title>
    </head>
    <body>
        
        <center>
        <h1>Please fill in your bio below</h1>
        <form action="register" method="post" enctype="multipart/form-data">
    <table>
    <tr>
    <td> Name:  </td>
    <td><input type="text" name="name" /></td>
        </tr>
     <tr>
    <td>Password: </td>
    <td> <input type="text" name="password" /></td>
        </tr>
         <tr>
    <td>E-Mail:</td>
    <td> <input type="text" name="email" /></td>
        </tr>
         <tr>
    <td> Gender: </td>
    <td><input type="text" name="gender" /></td>
        </tr>
         <tr>
    <td>ImageUpload:  </td>
    <td> <input type="file" name="myFile" /></td>
        </tr>
         <tr>
    <td></td>
    <td><input type="submit" value="Upload"/></td>
        </tr>
    </table>
   </form></center>
    <p><p>Click <a href="viewRegistered">here</a> to see the database.</p></p>
    </body>
</html>
