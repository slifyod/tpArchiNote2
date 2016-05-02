<%--
  Created by IntelliJ IDEA.
  User: linux
  Date: 30/04/16
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Joueurs</title>
    <c:set var="loged" value="false"/>
    <c:if test="${sessionScope.authenticated != null}">
        <c:set var="loged" value="true"/>
    </c:if>
</head>
<body>

<c:if test="${loged}">
    <%-- TODO Button to add new players go to /restrict/infoplayers--%>
    <form method="GET" action="/infoPlayer">
        <input type="submit" value="Ajouter un player">
        <input type="hidden"
               name="edit_mode"
               value="true"/>
    </form>
</c:if>


<c:forEach var="player" items="${requestScope.players}">
    <%--TODO display the player and add form when we are log with the next code : --%>
    nom = ${player.name} / goals id = ${player.goals} / team id = ${player.team} / note = ${player.note}
    <c:if test="${loged}">
        <%--TODO Button to modify matches go to /restrict/infoplayers with the id player selected in param--%>
        <form method="GET" action="/infoPlayer">
            <input type="submit" value="Acceder à la page de modification">
            <input type="hidden"
                   name="edit_mode"
                   value="true"/>
            <input type="hidden" name="match_id" value="<c:out value="${player.id}"/>"/>
        </form>
    </c:if>
    <br>
</c:forEach>

</body>
</html>
