<%-- 
    Document   : ageCalculator
    Created on : 27-Sep-2020, 4:49:14 PM
    Author     : cocog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
           <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <P>
                ${message}<br>
                <a href="arithmetic"> Arithmetic Calculator</a>
            </p>
        
            
    </head>
</html>
