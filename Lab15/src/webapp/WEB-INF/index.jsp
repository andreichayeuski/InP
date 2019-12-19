<%@ page import="main.java.EmailAdmin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Messages</title>
  </head>
  <body>
<%
  out.write(EmailAdmin.showMessages(application.getInitParameter("UserEmail"),
          application.getInitParameter("UserPassword")));
%>
  </body>
</html>
