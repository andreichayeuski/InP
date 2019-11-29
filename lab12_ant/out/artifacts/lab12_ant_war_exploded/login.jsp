<%--
  Created by IntelliJ IDEA.
  User: aliona.sauchuk
  Date: 10/11/2019
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FORM login</title>
</head>
<body>
    <form method="post" action="j_security_check">
        username <input type="text" name="j_username" />
        password <input type="password" name="j_password" />
        <input type="submit" />
    </form>
</body>
</html>
