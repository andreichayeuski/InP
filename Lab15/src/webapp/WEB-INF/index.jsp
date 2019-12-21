<%@ page import="main.java.EmailAdmin" %>
<%@ page import="javax.mail.MessagingException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Messages</title>
    <script src = "jquery-3.2.1.min.js"></script>
  </head>
  <body>
<%
  try {
    out.write(EmailAdmin.showMessages(application.getInitParameter("UserEmail"),
            application.getInitParameter("UserPassword")));
  } catch (MessagingException e) {
    e.printStackTrace();
  }
%>
<script>
  $(document).ready(function(){
    $("div").on('click', function () {
      $(this).find('.hidden').show();
    });
  });
</script>
  </body>
</html>
