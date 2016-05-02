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
    <title>Modification Team</title>
</head>
<body>

<form action="/infoteam" method="post">
    <input type="hidden" name="team_id" value="${requestScope.team.id}"/>
    Name = <input type="text" name="team_name" value="${requestScope.team.name}"/><br>
    <input type="submit" value="Valider"/>
</form>

</body>
</html>
