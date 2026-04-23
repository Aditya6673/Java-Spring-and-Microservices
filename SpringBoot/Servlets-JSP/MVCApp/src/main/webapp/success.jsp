<%--
  Created by IntelliJ IDEA.
  User: adity
  Date: 24-04-2026
  Time: 01:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h1><marquee>Registration Successful</marquee></h1>
<% String name = session.getAttribute("name").toString(); %>
<h2>Congrats <%=name%>, you have registered.</h2>
</body>
</html>
