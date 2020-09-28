<%-- 
    Document   : arithmeticCalculator
    Created on : 27-Sep-2020, 4:49:32 PM
    Author     : cocog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="first" value="${first}"><br>
            Last: <input type="number" name="second" value="${second}"><br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="modulus" value="%">
        </form>
            <P>
                ${message}<br>
                <a href="age"> Age Calculator</a>
            </p>
    </body>
</html>
