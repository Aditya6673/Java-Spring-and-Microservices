<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP Web App</title>
</head>
<body bgcolor="#00ffff" style="text-align: center">
<h1>JSP Web App to generate Dynamic Response</h1>
<%@ page import="java.util.Date" %>
<%!
  int age = 25;
%>
<%
  String name = request.getParameter("name");
  String email = request.getParameter("email");
  Date date = new Date();
%>
<h2>Registration Successful!</h2>
<p>Name: <%= name %></p>
<p>Email: <%= email %></p>
<p>Date: <%= date %></p>
</body>
</html>
