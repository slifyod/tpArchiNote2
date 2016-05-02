<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linux
  Date: 30/04/16
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info palyer</title>
    <c:set var="loged" value="false"/>
    <c:if test="${sessionScope.authenticated != null}">
        <c:set var="loged" value="true"/>
    </c:if>
</head>
<body>
<%--TODO Add edit button when logged--%>
<c:if test="${loged}">
    <form method="GET" action="/infoPlayer">
        <input type="submit" value="Acceder à la page de modification">
        <input type="hidden"
               name="edit_mode"
               value="true"/>
        <input type="hidden" name="player_id" value="${requestScope.player.id}"/>
    </form>
</c:if>
<%--TODO load player with ${player} --%>

name = ${requestScope.player.name}<br>
goals id = ${requestScope.player.goals}<br>
note = ${requestScope.player.note}<br>

</body>
</html>
