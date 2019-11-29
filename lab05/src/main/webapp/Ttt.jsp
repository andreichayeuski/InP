<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="usr" uri="usertaglib.tld" %>
<html>
<head>
    <title>05 - taglib</title>
</head>
<body>
<usr:dossier action="/Ttt">
    <usr:firstname value="Username"/>
    <br/>
    <usr:lastname value="Username"/>
    <br/>
    <usr:sex/>
    <br/>
    <usr:submit/>
</usr:dossier>
</body>
</html>