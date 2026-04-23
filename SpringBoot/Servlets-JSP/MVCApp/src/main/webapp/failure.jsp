<%--
  Created by IntelliJ IDEA.
  User: adity
  Date: 24-04-2026
  Time: 01:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Failure</title>
</head>
<body>
<h1><marquee>Registration Failed</marquee></h1>
<% String name = session.getAttribute("name").toString(); %>
<h2>Oops <%=name%>, you have failed to register.</h2>

</body>
</html>
