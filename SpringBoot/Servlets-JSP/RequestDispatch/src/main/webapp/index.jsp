<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Request Dispatch</title>
</head>
<body bgcolor="#00ffff" style="text-align: center">
<h1><%= "Kindly Register" %></h1>
<form method="post" action="./firstServlet">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
</form>

</body>
</html>