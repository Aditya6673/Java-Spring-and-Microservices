<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body bgcolor="#00ffff" style="align-content: center">
<h1><%= "Welcome to our web app" %></h1>
<h2>Kindly register to proceed!</h2>
<form method="post" action="./servlet">
    <table>
        <tr>
            <td>
                <label>Name:</label>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>
                <label>Email:</label>
                <input type="text" name="email">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Register">
            </td>
        </tr>
    </table>
</form>
</body>
</html>