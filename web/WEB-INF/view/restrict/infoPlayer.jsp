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
    <title>Modification player</title>
</head>
<body>
<form action="/infoPlayer" method="post">
    <input type="hidden" name="player_id" value="${requestScope.player.id}"/>
    Name = <input type="text" name="player_name" value="${requestScope.player.name}" />
    Goals ID = <input type="text" name="player_goals_id" value="${requestScope.player.goals}"/><br>
    Team ID = <input type="text" name="player_team_id" value="${requestScope.player.team}"/><br>
    Note = <input type="text" name="player_note" value="${requestScope.player.note}"/><br>
    <input type="submit" value="Valider"/>
</form>

</body>
</html>
