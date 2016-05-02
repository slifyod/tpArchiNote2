<%--
  Created by IntelliJ IDEA.
  User: linux
  Date: 30/04/16
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Match Edition</title>
</head>
<body>
<%--TODO You have match in param load it with ${match} submit in POST to the same page ?--%>

<form action="/infoMatch" method="post">
    <input type="hidden" name="match_id" value="${requestScope.match.id}"/>
    Date = <input type="date" name="date" value="${requestScope.match.date}"/><br>
    City = <input type="text" name="city" value="${requestScope.match.city}"/><br>
    Stadium = <input type="text" name="stadium" value="${requestScope.match.stadium}"/>
    <input type="submit" value="Valider"/>
</form>

</body>
</html>
